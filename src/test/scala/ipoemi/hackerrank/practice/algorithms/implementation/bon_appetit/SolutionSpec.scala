package ipoemi.hackerrank.practice.algorithms.implementation.bon_appetit

import java.io.{ByteArrayInputStream, ByteArrayOutputStream}

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val oStream = new ByteArrayOutputStream()
      Console.withOut(oStream) {
        Solution.bonappetit(1, Array(3, 10, 2, 9), 12)
      }

      val expect = s"5${System.lineSeparator()}"

      oStream.toString shouldBe expect
    }

    "TestCase #1" in {
      val oStream = new ByteArrayOutputStream()
      Console.withOut(oStream) {
        Solution.bonappetit(1, Array(3, 10, 2, 9), 7)
      }
      val expect = s"Bon Appetit${System.lineSeparator()}"

      oStream.toString shouldBe expect
    }

  }

}

