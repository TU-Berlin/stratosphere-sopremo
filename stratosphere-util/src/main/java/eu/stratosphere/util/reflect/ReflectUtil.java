package eu.stratosphere.util.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.google.common.primitives.Primitives;

/**
 * Convenience methods for reflective programming.
 */
public class ReflectUtil {
	private static Map<Class<?>, DynamicClass<?>> CACHED_CLASSES = new HashMap<Class<?>, DynamicClass<?>>();

	/**
	 * Returns the first annotation of the specified annotation type for the given type.<br>
	 * If no annotation is found for the type, the hierarchical ancestors are examined.
	 * 
	 * @param type
	 *        the type which might be annotated
	 * @param annotationType
	 *        the annotation type
	 * @return the annotation or null
	 */
	public static <A extends Annotation> A getAnnotation(final Class<?> type, final Class<A> annotationType) {
		A annotation = null;
		for (Class<?> t = type; annotation == null && t != null; t = t.getSuperclass())
			annotation = t.getAnnotation(annotationType);
		return annotation;
	}

	/**
	 * Returns the first annotation of the specified annotation type for the given field.<br>
	 * If no annotation is found for the type, the hierarchical ancestors are examined.
	 * 
	 * @param field
	 *        the field which might be annotated
	 * @param annotationType
	 *        the annotation type
	 * @return the annotation or null
	 */
	public static <A extends Annotation> A getAnnotation(final Field field, final Class<A> annotationType) {
		A annotation = null;
		annotation = field.getAnnotation(annotationType);
		return annotation;
	}

	/**
	 * Returns the hierarchical distance between a class and a derived class. <br>
	 * For instance,
	 * <ul>
	 * <li><code>getDistance(Integer.class, Integer.class) == 0</code>
	 * <li><code>getDistance(Number.class, Integer.class) == 1</code>
	 * <li><code>getDistance(Object.class, Integer.class) == 2</code>
	 * <li><code>getDistance(Comparable.class, Integer.class) == 1</code>
	 * <li><code>getDistance(Serializable.class, Integer.class) == 2</code>.
	 * </ul>
	 * 
	 * @param superClass
	 *        the super class in the hierarchy
	 * @param subclass
	 *        the sub class of the hierarchy
	 * @return the minimum distance or -1 if <code>subclass</code> is not a subclass of <code>superclass</code>
	 */
	public static int getDistance(final Class<?> superClass, final Class<?> subclass) {
		if (subclass == null)
			return 0;
		if (isSameTypeOrPrimitive(superClass, subclass))
			return 0;
		if (!superClass.isAssignableFrom(subclass))
			return -1;

		if (superClass.isInterface()) {
			final Class<?>[] interfaces = subclass.getInterfaces();
			int minDistance = Integer.MAX_VALUE;
			for (final Class<?> xface : interfaces)
				if (xface == superClass) {
					minDistance = 1;
					break;
				} else if (superClass.isAssignableFrom(xface))
					minDistance = Math.min(minDistance, getDistance(superClass, xface) + 1);
			if (minDistance != Integer.MAX_VALUE)
				return minDistance;
			return getDistance(superClass, subclass.getSuperclass()) + 1;
		}

		int distance = 1;
		for (Class<?> klazz = subclass; superClass != klazz; distance++)
			klazz = klazz.getSuperclass();
		return distance;
	}

	public static synchronized <T> DynamicClass<T> getDynamicClass(final Class<T> clazz) {
		@SuppressWarnings("unchecked")
		DynamicClass<T> dynamicClass = (DynamicClass<T>) CACHED_CLASSES.get(clazz);
		if (dynamicClass == null)
			CACHED_CLASSES.put(clazz, dynamicClass = new DynamicClass<T>(clazz));
		return dynamicClass;
	}

	public static synchronized List<Field> getFields(final Class<?> clazz, final String name,
			final int... modifierBitsets) {
		final ArrayList<Field> fields = new ArrayList<Field>();
		for (final Field field : clazz.getDeclaredFields())
			if (name == null || field.getName().equals(name)) {
				for (final int modifiers : modifierBitsets)
					if ((field.getModifiers() & modifiers) != modifiers)
						continue;
				fields.add(field);
			}
		return fields;
	}

	public static List<Type> getHierarchy(final Class<?> superClass, final Class<?> subclass) {
		if (!superClass.isAssignableFrom(subclass))
			throw new IllegalArgumentException();

		List<Type> hierarchy = new ArrayList<Type>();
		if (superClass == subclass)
			return hierarchy;

		if (superClass.isInterface()) {
			final Type[] interfaces = subclass.getGenericInterfaces();
			int minDistance = Integer.MAX_VALUE;
			for (final Type xface : interfaces) {

				final Class<?> type = (Class<?>) (xface instanceof Class ? xface : ((ParameterizedType) xface)
					.getRawType());
				if (type == superClass) {
					hierarchy.clear();
					hierarchy.add(xface);
					break;
				}

				if (superClass.isAssignableFrom(type)) {
					final List<Type> partialHierarchy = getHierarchy(superClass, type);
					if (partialHierarchy.size() + 1 < minDistance) {
						hierarchy = partialHierarchy;
						hierarchy.add(0, xface);
						minDistance = hierarchy.size();
					}
				}
			}
			if (hierarchy.isEmpty()) {
				hierarchy.add(subclass.getGenericSuperclass());
				hierarchy.addAll(getHierarchy(superClass, subclass.getSuperclass()));
			}
			return hierarchy;
		}

		Type clazz = subclass;
		Class<?> rawType = subclass;
		do {
			hierarchy.add(clazz);
			rawType = (Class<?>) (clazz instanceof Class ? clazz : ((ParameterizedType) clazz).getRawType());
			clazz = rawType.getGenericSuperclass();
		} while (superClass != rawType);
		return hierarchy;
	}

	public static synchronized List<Method> getMethods(final Class<?> clazz, final String name,
			final int... modifierBitsets) {
		final ArrayList<Method> methods = new ArrayList<Method>();
		int modifiers = 0;
		for (final int modifier : modifierBitsets)
			modifiers |= modifier;
		for (final Method method : clazz.getDeclaredMethods())
			if (name == null || method.getName().equals(name)) {
				if ((method.getModifiers() & modifiers) != modifiers)
					continue;
				methods.add(method);
			}
		return methods;
	}

	/**
	 * Checks dynamically whether the object has the specified function, which takes the given parameters.
	 * 
	 * @param object
	 *        the object to invoke on
	 * @param function
	 *        the function to call
	 * @param params
	 *        the parameters of the function
	 * @return true if such a method exists
	 */
	public static boolean hasFunction(final Object object, final String function, final Object... params) {
		return getDynamicClass(object.getClass()).getMethod(function).isInvokableFor(params);
	}

	/**
	 * Dynamically invokes the specified function on an object with the given parameters.
	 * 
	 * @param object
	 *        the object to invoke on
	 * @param function
	 *        the function to call
	 * @param params
	 *        the parameters of the function
	 * @return the result of the invocation
	 * @throws Throwable
	 */
	@SuppressWarnings("unchecked")
	public static Object invoke(final Object object, final String function, final Object... params) throws Throwable {
		try {
			return getDynamicClass((Class<Object>) object.getClass()).getMethod(function).invoke(object, params);
		} catch (final Exception e) {
			throw new IllegalArgumentException(e);
		}
	}

	/**
	 * Returns true if the given type has an accessible default constructor.<br>
	 * Note: this method is thread-safe
	 * 
	 * @param type
	 *        the type to check
	 * @return true if it has an accessible default constructor.
	 */
	public static boolean isInstantiable(final Class<?> type) {
		return getDynamicClass(type).isInstantiable();
	}

	/**
	 * Returns true if both types are the same or represent the same primitive or boxing type.
	 * 
	 * @param type1
	 *        the first type
	 * @param type2
	 *        the second type
	 * @return the boxing class or null if the given class is not a primitive
	 */
	public static boolean isSameTypeOrPrimitive(final Class<?> type1, final Class<?> type2) {
		return Primitives.wrap(type1) == Primitives.wrap(type2);
	}

	/**
	 * Creates a new instance of the given type by invoking the default constructor. If the default constructor is not
	 * public, the method will try to
	 * gain access through {@link Constructor#setAccessible(boolean)}. <br>
	 * <br>
	 * Note: this method is thread-safe
	 * 
	 * @param <T>
	 *        the type to instantiate
	 * @param type
	 *        the type to instantiate
	 * @return the created instance
	 */
	public static <T> T newInstance(final Class<T> type) throws IllegalArgumentException {
		try {
			return getDynamicClass(type).newInstance();
		} catch (final Throwable e) {
			throw new IllegalArgumentException(e);
		}
	}

	/**
	 * Creates a new instance of the given type by invoking the best public constructor for the given parameter.<br>
	 * If there are multiple compatible constructors, the most specific one is chosen. <br>
	 * If there are several constructors with the same degree of specify, an Exception is thrown. <br>
	 * Note: this method is thread-safe
	 * 
	 * @param <T>
	 *        the type to instantiate
	 * @param type
	 *        the type to instantiate
	 * @param params
	 *        The constructors parameters.
	 * @return the created instance
	 * @throws IllegalArgumentException
	 *         if the type has 0 or more than 2 matching constructors or an exception occurred during the invocation:
	 *         possible causes are {@link NoSuchMethodException}, {@link InstantiationException} ,
	 *         {@link IllegalAccessException}, {@link InvocationTargetException}
	 */
	public static <T> T newInstance(final Class<T> type, final Object... params) throws IllegalArgumentException {
		try {
			return getDynamicClass(type).newInstance(params);
		} catch (final Throwable e) {
			throw new IllegalArgumentException(e);
		}
	}

	public static void setField(final Object object, final Class<?> declaringClass, final String fieldName,
			final Object value) {
		try {
			final Field field = declaringClass.getDeclaredField(fieldName);
			field.setAccessible(true);
			field.set(object, value);
		} catch (final Exception e) {
			throw new IllegalArgumentException(
				String.format("Cannot set field %s of %s to %s", fieldName, object, value), e);
		}
	}

	public static void setField(final Object object, final String fieldName, final Object value) {
		setField(object, object.getClass(), fieldName, value);
	}
}
