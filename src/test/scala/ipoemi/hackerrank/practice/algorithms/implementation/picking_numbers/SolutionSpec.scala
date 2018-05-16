package ipoemi.hackerrank.practice.algorithms.implementation.picking_numbers

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 3
      val sol = Solution.pickingNumbers(Array(4, 6, 5, 3, 3, 1))

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = 5
      val sol = Solution.pickingNumbers(Array(1, 2, 2, 3, 1, 2))

      sol shouldBe expect
    }
  }

}

