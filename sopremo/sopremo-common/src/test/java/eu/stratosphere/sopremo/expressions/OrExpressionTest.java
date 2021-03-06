package eu.stratosphere.sopremo.expressions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import nl.jqno.equalsverifier.EqualsVerifier;

import org.junit.Assert;
import org.junit.Test;

import eu.stratosphere.sopremo.type.BooleanNode;
import eu.stratosphere.sopremo.type.IJsonNode;

public class OrExpressionTest extends BooleanExpressionTest<OrExpression> {

	@Test
	public void shouldBeFalseIfNoExprIsTrue() {
		final IJsonNode result =
			new OrExpression(FALSE, BooleanExpression.ensureBooleanExpression(EvaluationExpression.VALUE), FALSE).
				evaluate(BooleanNode.FALSE);

		Assert.assertEquals(BooleanNode.FALSE, result);
	}

	@Test
	public void shouldBeTrueIfOneExprIsTrue() {
		final IJsonNode result =
			new OrExpression(FALSE, BooleanExpression.ensureBooleanExpression(EvaluationExpression.VALUE), FALSE).
				evaluate(BooleanNode.TRUE);

		Assert.assertEquals(BooleanNode.TRUE, result);
	}

	@Override
	protected OrExpression createDefaultInstance(final int index) {
		final BooleanExpression[] params = new BooleanExpression[index + 1];
		Arrays.fill(params, TRUE);
		return new OrExpression(params);
	}

	/*
	 * (non-Javadoc)
	 * @see eu.stratosphere.sopremo.expressions.OrExpressionTest#initVerifier(nl.jqno.equalsverifier.EqualsVerifier)
	 */
	@Override
	protected void initVerifier(final EqualsVerifier<OrExpression> equalVerifier) {
		super.initVerifier(equalVerifier);
		equalVerifier.withPrefabValues(List.class, new ArrayList<Object>(), new ArrayList<EvaluationExpression>(
			Collections.singleton(TRUE)));
	}

}
