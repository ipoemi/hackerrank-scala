package ipoemi.hackerrank.practice.algorithms.implementation.non_divisible_subset

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 3
      val sol = Solution.nonDivisibleSubset(3, Array(1, 7, 2, 4))

      sol shouldBe expect
    }

  }

}
