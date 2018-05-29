package ipoemi.hackerrank.practice.algorithms.implementation.jumping_on_the_clouds_revisited

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #-1" in {
      val expect = 96
      val sol = Solution.jumpingOnClouds(Array(0, 0, 1, 0), 2)

      sol shouldBe expect
    }

    "TestCase #0" in {
      val expect = 92
      val sol = Solution.jumpingOnClouds(Array(0, 0, 1, 0, 0, 1, 1, 0), 2)

      sol shouldBe expect
    }

  }

}
