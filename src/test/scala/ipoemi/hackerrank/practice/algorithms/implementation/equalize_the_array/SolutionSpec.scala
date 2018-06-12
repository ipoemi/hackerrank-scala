package ipoemi.hackerrank.practice.algorithms.implementation.equalize_the_array

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #-1" in {
      val expect = 2
      val sol = Solution.equalizeArray(Array(1, 2, 2, 3))

      sol shouldBe expect
    }

    "TestCase #0" in {
      val expect = 2
      val sol = Solution.equalizeArray(Array(3, 3, 2, 1, 3))

      sol shouldBe expect
    }

  }

}
