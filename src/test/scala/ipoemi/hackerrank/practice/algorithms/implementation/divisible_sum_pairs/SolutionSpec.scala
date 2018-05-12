package ipoemi.hackerrank.practice.algorithms.implementation.divisible_sum_pairs

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 5
      val sol = Solution.divisibleSumPairs(6, 3, Array(1, 3, 2, 6, 1, 2))

      sol shouldBe expect
    }

  }

}

