package lists

import org.junit.Assert.*
import org.junit.Test

class KotlinListsTest {
    val lists = KotlinLists()

    @Test fun sum() {
        val list = listOf(1, 2, 3, 4)
        assertEquals(10, lists.sum(list))
    }

    @Test fun max() {
        val list = listOf(1, 2, 3)
        assertEquals(3, lists.max(list))
    }

    @Test fun exists_True() {
        val strings = listOf("a", "b")
        assertTrue(lists.exists(strings, "a"))
    }

    @Test fun exists_False() {
        val strings = listOf("a", "b")
        assertFalse(lists.exists(strings, "c"))
    }

    @Test fun indexOf_Found() {
        val strings = listOf("a", "b")
        assertEquals(1, lists.indexOf(strings, "b"))
    }

    @Test fun indexOf_NotFound() {
        val list = listOf(1, 2, 3)
        assertEquals(-1, lists.indexOf(list, 4))
    }
}