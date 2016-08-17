package helloworld

import helloworld.HelloWorldKotlin.main
import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Ignore
import org.junit.Test

class HelloWorldKotlinTest {
    @Test fun run() {
        main()
    }

    @Test fun pass() {
        assertTrue(true)
    }

    @Ignore @Test fun fail() {
        assertEquals(1, 2)
    }
}