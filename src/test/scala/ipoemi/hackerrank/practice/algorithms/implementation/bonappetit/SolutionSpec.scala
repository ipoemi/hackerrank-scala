package ipoemi.hackerrank.practice.algorithms.implementation.bonappetit

import java.io.{ByteArrayInputStream, ByteArrayOutputStream}

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val oStream = new ByteArrayOutputStream()
      Console.withOut(oStream) {
        Solution.bonappetit(1, Array(3, 10, 2, 9), 12)
      }
      val expect = "5\r\n"

      oStream.toString shouldBe expect
    }

    "TestCase #1" in {
      val oStream = new ByteArrayOutputStream()
      Console.withOut(oStream) {
        Solution.bonappetit(1, Array(3, 10, 2, 9), 7)
      }
      val expect = "Bon Appetit\r\n"

      oStream.toString shouldBe expect
    }

  }

}

