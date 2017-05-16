package lists

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpecLike, Matchers}

@RunWith(classOf[JUnitRunner])
class ScalaListsTest extends FlatSpecLike with Matchers {
  val lists = new ScalaLists

  it should "sum" in {
    val list = List(1, 2, 3, 4)
    lists.sum(list) shouldBe 10
  }

  it should "find the max" in {
    val list = List(1, 2, 3)
    lists.max(list) shouldBe 3
  }

  it should "exists_True" in {
    val strings = List("a", "b")
    lists.exists(strings, "a") shouldBe true
  }

  it should "exists_False" in {
    val strings = List("a", "b")
    lists.exists(strings, "c") shouldBe false
  }

  it should "indexOf_Found" in {
    val strings = List("a", "b")
    lists.indexOf(strings, "b") shouldBe 1
  }

  it should "indexOf_NotFound" in {
    val list = List(1, 2, 3)
    lists.indexOf(list, 4) shouldBe -1
  }

  it should "count_Found" in {
    val strings = List("a", "a", "b")
    lists.count(strings, "a") shouldBe 2
  }

  it should "count_NotFound" in {
    val list = List(1, 2, 3)
    lists.count(list, 4) shouldBe 0
  }

  it should "order the elements" in {
    val list = List(1, 2, 3)
    val expectedList = List(3, 2, 1)
    val f = (i1: Int, i2: Int) => {
      i1 > i2
    }
    lists.order(list, f) should contain theSameElementsInOrderAs expectedList
  }
}
