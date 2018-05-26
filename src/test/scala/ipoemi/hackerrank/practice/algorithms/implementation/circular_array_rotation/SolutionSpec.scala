package ipoemi.hackerrank.practice.algorithms.implementation.circular_array_rotation

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #-1" in {
      val expect = Array(5, 3)
      val sol = Solution.circularArrayRotation(Array(3, 4, 5), 2, Array(1, 2))

      sol shouldBe expect
    }

    "TestCase #0" in {
      val expect = Array(2, 3, 1)
      val sol = Solution.circularArrayRotation(Array(1, 2, 3), 2, Array(0, 1, 2))

      sol shouldBe expect
    }

  }

}
