package lists

import comparator.GreaterComparator
import io.kotlintest.matchers.Matcher
import io.kotlintest.matchers.Result
import io.kotlintest.matchers.should
import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.WordSpec

class KotlinListsTest : WordSpec() {
    val lists = KotlinLists()

    init {
        "KotlinLists" should {
            "sum" {
                val list = listOf(1, 2, 3, 4)
                lists.sum(list) shouldBe 10
            }

            "find the max" {
                val list = listOf(1, 2, 3)
                lists.max(list) shouldBe 3
            }

            "exists_True" {
                val strings = listOf("a", "b")
                lists.exists(strings, "a") shouldBe true
            }

            "exists_False" {
                val strings = listOf("a", "b")
                lists.exists(strings, "c") shouldBe false
            }

            "indexOf_Found" {
                val strings = listOf("a", "b")
                lists.indexOf(strings, "b") shouldBe 1
            }

            "indexOf_NotFound" {
                val list = listOf(1, 2, 3)
                lists.indexOf(list, 4) shouldBe -1
            }

            "count_Found" {
                val strings = listOf("a", "a", "b")
                lists.count(strings, "a") shouldBe 2
            }

            "cound_NotFound" {
                val list = listOf(1, 2, 3)
                lists.count(list, 4) shouldBe 0
            }

            "order the elements" {
                val list = listOf(1L, 2L, 3L)
                val expectedList = listOf(3L, 2L, 1L)
                lists.order(list, GreaterComparator()) should containTheSameElementsInOrderAs(expectedList)
            }
        }
    }

    fun <E> containTheSameElementsInOrderAs(expected: List<E>) = object : Matcher<List<E>> {
        override fun test(actual: List<E>): Result {
            val errorMessage = "[$actual] did not contain the same elements in order as [$expected]"
            val expectedSize = expected.size
            val actualSize = actual.size
            if (expectedSize != actualSize) {
                return Result(false, errorMessage)
            } else {
                var eq = true
                var message = ""
                var index = 0
                while (index < expectedSize) {
                    val e = expected.get(index)
                    val a = expected.get(index)
                    if (e != a) {
                        eq = false
                        message = errorMessage
                    }
                    index++
                }
                return Result(eq, message)
            }
        }
    }
}