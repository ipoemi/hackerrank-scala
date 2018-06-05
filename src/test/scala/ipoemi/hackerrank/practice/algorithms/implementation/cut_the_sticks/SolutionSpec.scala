package ipoemi.hackerrank.practice.algorithms.implementation.cut_the_sticks

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = Array(6, 4, 2, 1)
      val sol = Solution.cutTheSticks(Array(5, 4, 4, 2, 2, 8))

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = Array(8, 6, 4, 1)
      val sol = Solution.cutTheSticks(Array(1, 2, 3, 4, 3, 3, 2, 1))

      sol shouldBe expect
    }

  }

}
