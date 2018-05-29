package ipoemi.hackerrank.practice.algorithms.implementation.jumping_on_the_clouds

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 4
      val sol = Solution.jumpingOnClouds(Array(0, 0, 1, 0, 0, 1, 0))

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = 3
      val sol = Solution.jumpingOnClouds(Array(0, 0, 0, 0, 1, 0))

      sol shouldBe expect
    }

  }

}
