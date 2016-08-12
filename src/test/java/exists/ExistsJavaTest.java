package exists;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;

public class ExistsJavaTest {
	@Test
	public void exists_True() {
		final Collection<String> strings = Arrays.asList("a", "b");
		final ExistsJava existsJava = new ExistsJava();
		assertTrue(existsJava.exists(strings, "a"));
	}

	@Test
	public void exists_False() {
		final Collection<String> strings = Arrays.asList("a", "b");
		final ExistsJava existsJava = new ExistsJava();
		assertFalse(existsJava.exists(strings, "c"));
	}
}
