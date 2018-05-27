package ipoemi.hackerrank.practice.algorithms.implementation.fair_rations

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = "4"
      val sol = Solution.fairRations(Array(2, 3, 4, 5, 6))

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = "NO"
      val sol = Solution.fairRations(Array(1, 2))

      sol shouldBe expect
    }

  }

}

