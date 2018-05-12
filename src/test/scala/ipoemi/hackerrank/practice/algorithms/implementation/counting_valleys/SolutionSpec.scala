package ipoemi.hackerrank.practice.algorithms.implementation.counting_valleys

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 1
      val sol = Solution.countingValleys(8, "UDDDUDUU")

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = 2
      val sol = Solution.countingValleys(12, "DDUUDDUDUUUD")

      sol shouldBe expect
    }

  }

}

