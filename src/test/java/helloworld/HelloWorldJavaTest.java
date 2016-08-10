package helloworld;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Ignore;
import org.junit.Test;

public class HelloWorldJavaTest {
	@Test
	public void run() {
		HelloWorldJava.main(new String[0]);
	}

	@Test
	public void pass() {
		assertTrue(true);
	}

	@Ignore
	@Test
	public void fail() {
		assertEquals(1, 2);
	}
}
