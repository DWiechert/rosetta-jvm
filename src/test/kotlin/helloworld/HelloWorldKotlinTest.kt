package helloworld

import helloworld.HelloWorldKotlin.main
import io.kotlintest.matchers.shouldBe
import io.kotlintest.specs.WordSpec

class HelloWorldKotlinTest : WordSpec() {
    init {
        "HelloWorldKotlin" should {
            "run" {
                main()
            }

            "pass" {
                true shouldBe true
            }

            "fail" {
                1 shouldBe 2
            }.config(enabled = false)
        }
    }
}