package ipoemi.hackerrank.practice.algorithms.implementation.electronics_shop

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 9
      val sol = Solution.getMoneySpent(Array(3, 1), Array(5, 2, 8), 10)

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = -1
      val sol = Solution.getMoneySpent(Array(4), Array(5), 5)

      sol shouldBe expect
    }

  }

}

