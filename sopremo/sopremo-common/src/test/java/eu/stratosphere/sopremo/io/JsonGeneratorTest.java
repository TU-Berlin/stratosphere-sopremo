package eu.stratosphere.sopremo.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import eu.stratosphere.sopremo.type.ArrayNode;
import eu.stratosphere.sopremo.type.BooleanNode;
import eu.stratosphere.sopremo.type.IJsonNode;
import eu.stratosphere.sopremo.type.IntNode;
import eu.stratosphere.sopremo.type.MissingNode;
import eu.stratosphere.sopremo.type.NullNode;
import eu.stratosphere.sopremo.type.ObjectNode;
import eu.stratosphere.sopremo.type.TextNode;

public class JsonGeneratorTest {
	private static ObjectNode obj;

	private static ArrayNode<IJsonNode> arr;

	private String getResource(final String name) throws IOException {
		return JsonInputFormatTest.class.getClassLoader().getResources(name)
			.nextElement().toString();
	}
	
	@Test
	public void shouldGenerateGivenFile() {
		try {
			final JsonParser parser = new JsonParser(this.getResource("JsonInputFormat/test.json"));
			final File file = File.createTempFile("test", "json");
			final JsonGenerator gen = new JsonGenerator(file);
			gen.writeStartArray();
			while (!parser.checkEnd())
				gen.writeTree(parser.readValueAsTree());
			gen.writeEndArray();
			gen.close();
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testGeneration() {
		try {
			final File file = File.createTempFile("test", "json");
			final JsonGenerator gen = new JsonGenerator(file);
			// gen.writeStartArray();
			gen.writeTree(arr);
			// gen.writeEndArray();
			gen.close();
			final JsonParser parser = new JsonParser(new FileReader(file));
			parser.readValueAsTree();
			Assert.assertEquals(MissingNode.getInstance(), parser.readValueAsTree());
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testObjectNodeSerialization() {
		try {
			final File file = File.createTempFile("test", "json");
			final JsonGenerator gen = new JsonGenerator(file);
			gen.writeTree(obj);
			gen.close();
			final JsonParser parser = new JsonParser(new FileReader(file));
			Assert.assertEquals(obj, parser.readValueAsTree());
		} catch (final IOException e) {
			e.printStackTrace();
		}
	}

	@BeforeClass
	public static void setUpClass() {
		obj = new ObjectNode();
		final ArrayNode<IJsonNode> friends = new ArrayNode<IJsonNode>();

		friends.add(new ObjectNode().put("name", TextNode.valueOf("testfriend 1")).put("age", IntNode.valueOf(20))
			.put("male", BooleanNode.TRUE));
		friends.add(new ObjectNode().put("name", TextNode.valueOf("testfriend 2")).put("age", IntNode.valueOf(30))
			.put("male", BooleanNode.FALSE));
		friends.add(new ObjectNode().put("name", TextNode.valueOf("testfriend \" 2")).put("age", IntNode.valueOf(40))
			.put("male", NullNode.getInstance()));
		friends.add(NullNode.getInstance());

		obj.put("name", TextNode.valueOf("Person 1")).put("age", IntNode.valueOf(25)).put("male", BooleanNode.TRUE)
			.put("friends", friends);

		arr = new ArrayNode<IJsonNode>();
		arr.add(obj);
		arr.add(NullNode.getInstance());
		arr.add(obj);
	}
}
