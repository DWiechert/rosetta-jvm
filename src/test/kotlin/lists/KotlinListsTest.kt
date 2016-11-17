package lists

import org.junit.Assert.*
import org.junit.Test
import java.util.*

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

    @Test fun count_Found() {
        val strings = listOf("a", "a", "b")
        assertEquals(2, lists.count(strings, "a"))
    }

    @Test fun count_NotFound() {
        val list = listOf(1, 2, 3)
        assertEquals(0, lists.count(list, 4))
    }

    @Test fun order() {
        val list = listOf(1, 2, 3)
        val expectedList = listOf(3, 2, 1)
        assertEquals(expectedList, lists.order(list, GreaterComparator()))
    }

    private class GreaterComparator : Comparator<Int> {
        override fun compare(o1: Int, o2: Int) = if (o1 > o2) -1 else 1
    }
}