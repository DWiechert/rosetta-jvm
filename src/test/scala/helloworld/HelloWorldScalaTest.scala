package helloworld

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.{FlatSpecLike, Matchers}

@RunWith(classOf[JUnitRunner])
class HelloWorldScalaTest extends FlatSpecLike with Matchers {
  it should "run successfully" in {
    HelloWorldScala.main(new Array[String](0))
  }

  it should "pass" in {
    true shouldBe true
  }

  ignore should "fail" in {
    1 shouldBe 2
  }
}