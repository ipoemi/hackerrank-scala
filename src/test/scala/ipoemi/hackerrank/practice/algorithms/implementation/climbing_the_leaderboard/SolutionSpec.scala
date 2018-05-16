package ipoemi.hackerrank.practice.algorithms.implementation.climbing_the_leaderboard

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #1" in {
      val expect = Array(6, 4, 2, 1)
      val sol = Solution.climbingLeaderboard(Array(100, 100, 50, 40, 40, 20, 10), Array(5, 25, 50, 120))

      sol shouldBe expect
    }

  }

}

