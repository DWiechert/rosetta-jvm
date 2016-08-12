package exists

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ExistsScalaTest extends FunSuite {
  test("exists_True") {
    val strings = List("a", "b")
    val exists = new ExistsScala
    assert(exists.exists(strings, "a"))
  }

  test("exists_False") {
    val strings = List("a", "b")
    val exists = new ExistsScala
    assert(exists.exists(strings, "c") == false)
  }
}
