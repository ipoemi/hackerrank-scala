package ipoemi.hackerrank.practice.algorithms.implementation.cats_and_a_mouse

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = "Cat B"
      val sol = Solution.catAndMouse(1, 2, 3)

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = "Mouse C"
      val sol = Solution.catAndMouse(1, 3, 2)

      sol shouldBe expect
    }

  }

}

