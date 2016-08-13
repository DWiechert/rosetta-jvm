package lists;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class JavaListsTest {
	private static final JavaLists lists = new JavaLists();

	@Test
	public void sum() {
		final List<Integer> list = Arrays.asList(1, 2, 3, 4);
		assertEquals(Integer.valueOf(10), lists.sum(list));
	}

	@Test
	public void max() {
		final List<Integer> list = Arrays.asList(1, 2, 3);
		assertEquals(Integer.valueOf(3), lists.max(list));
	}

	@Test
	public void exists_True() {
		final List<String> strings = Arrays.asList("a", "b");
		assertTrue(lists.exists(strings, "a"));
	}

	@Test
	public void exists_False() {
		final List<String> strings = Arrays.asList("a", "b");
		assertFalse(lists.exists(strings, "c"));
	}
}
