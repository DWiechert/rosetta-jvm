package lists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class JavaListsTest {
	@Test
	public void exists_True() {
		final List<String> strings = Arrays.asList("a", "b");
		final JavaLists javaLists = new JavaLists();
		assertTrue(javaLists.exists(strings, "a"));
	}

	@Test
	public void exists_False() {
		final List<String> strings = Arrays.asList("a", "b");
		final JavaLists javaLists = new JavaLists();
		assertFalse(javaLists.exists(strings, "c"));
	}
}
