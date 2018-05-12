package ipoemi.hackerrank.practice.algorithms.implementation.day_of_the_programmer

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = "13.09.2017"
      val sol = Solution.solve(2017)

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = "12.09.2016"
      val sol = Solution.solve(2016)

      sol shouldBe expect
    }

    "TestCase #2" in {
      val expect = "12.09.1800"
      val sol = Solution.solve(1800)

      sol shouldBe expect
    }
  }

}

