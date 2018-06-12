package ipoemi.hackerrank.practice.algorithms.implementation.repeated_string

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 7
      val sol = Solution.repeatedString("aba", 10)

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = 1000000000000L
      val sol = Solution.repeatedString("a", 1000000000000L)

      sol shouldBe expect
    }

  }

}
