package helloworld

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

@RunWith(classOf[JUnitRunner])
class HelloWorldScalaTest extends FunSuite {
  test("run") {
    HelloWorldScala.main(new Array[String](0))
  }
  
  test("pass") {
    assert(true)
  }
  
  ignore("fail") {
    assert(1 === 2)
  }
}