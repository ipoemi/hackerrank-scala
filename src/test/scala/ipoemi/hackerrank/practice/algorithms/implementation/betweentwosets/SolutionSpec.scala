package ipoemi.hackerrank.practice.algorithms.implementation.betweentwosets

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 3
      val sol = Solution.getTotalX(Array(2, 4), Array(16, 32, 96))

      sol shouldBe expect
    }
  }

}

