package ipoemi.hackerrank.practice.algorithms.implementation.sequence_equation

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #-1" in {
      val expect = Array(4, 2, 5, 1, 3)
      val sol = Solution.permutationEquation(Array(5, 2, 1, 3, 4))

      sol shouldBe expect
    }

    "TestCase #0" in {
      val expect = Array(2, 3, 1)
      val sol = Solution.permutationEquation(Array(2, 3, 1))

      sol shouldBe expect
    }

  }

}
