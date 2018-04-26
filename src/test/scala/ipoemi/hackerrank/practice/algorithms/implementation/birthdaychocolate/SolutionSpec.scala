package ipoemi.hackerrank.practice.algorithms.implementation.birthdaychocolate

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 2
      val sol = Solution.solve(5, Array(1, 2, 1, 3, 2), 3, 2)

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = 0
      val sol = Solution.solve(6, Array(1, 1, 1, 1, 1, 1), 3, 2)

      sol shouldBe expect
    }

    "TestCase #2" in {
      val expect = 1
      val sol = Solution.solve(4, Array(4), 4, 1)

      sol shouldBe expect
    }
  }

}

