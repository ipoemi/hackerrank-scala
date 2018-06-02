package ipoemi.hackerrank.practice.algorithms.implementation.sherlock_and_squares

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 2
      val sol = Solution.squares(3, 9)

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = 0
      val sol = Solution.squares(17, 24)

      sol shouldBe expect
    }

  }

}
