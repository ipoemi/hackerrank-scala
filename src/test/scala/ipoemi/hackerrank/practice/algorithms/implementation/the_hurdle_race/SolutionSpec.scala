package ipoemi.hackerrank.practice.algorithms.implementation.the_hurdle_race

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 2
      val sol = Solution.hurdleRace(4, Array(1, 6, 3, 5, 2))

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = 0
      val sol = Solution.hurdleRace(7, Array(2, 5, 4, 5, 2))

      sol shouldBe expect
    }
  }

}

