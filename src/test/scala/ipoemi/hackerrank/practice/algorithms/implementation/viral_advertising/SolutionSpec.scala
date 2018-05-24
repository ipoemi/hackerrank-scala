package ipoemi.hackerrank.practice.algorithms.implementation.viral_advertising

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 9
      val sol = Solution.viralAdvertising(3)

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = 15
      val sol = Solution.viralAdvertising(4)

      sol shouldBe expect
    }

  }

}
