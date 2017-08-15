package lists;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import comparator.GreaterComparator;
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

	@Test
	public void indexOf_Found() {
		final List<String> strings = Arrays.asList("a", "b");
		assertEquals(1, lists.indexOf(strings, "b"));
	}

	@Test
	public void indexOf_NotFound() {
		final List<Integer> list = Arrays.asList(1, 2, 3);
		assertEquals(-1, lists.indexOf(list, 4));
	}

	@Test
	public void count_Found() {
		final List<String> strings = Arrays.asList("a", "a", "b");
		assertEquals(2, lists.count(strings, "a"));
	}

	@Test
	public void count_NotFound() {
		final List<Integer> list = Arrays.asList(1, 2, 3);
		assertEquals(0, lists.count(list, 4));
	}

	@Test
	public void order() {
		final List<Long> list = Arrays.asList(1L, 2L, 3L);
		final List<Long> expectedList = Arrays.asList(3L, 2L, 1L);
		assertEquals(expectedList, lists.order(list, new GreaterComparator()));
	}

	@Test
	public void zip() {
		final List<Object> list1 = Arrays.asList("a", "b", "c");
		final List<Object> list2 = Arrays.asList(1, 2, 3);
		final List<Object> expectedList = Arrays.asList("a", 1, "b", 2, "c", 3);
		assertEquals(expectedList, lists.zip(list1, list2));
	}
}
