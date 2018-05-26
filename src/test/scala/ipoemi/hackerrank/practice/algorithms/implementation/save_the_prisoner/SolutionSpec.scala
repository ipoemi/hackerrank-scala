package ipoemi.hackerrank.practice.algorithms.implementation.save_the_prisoner

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 2
      val sol = Solution.saveThePrisoner(5, 2, 1)

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = 3
      val sol = Solution.saveThePrisoner(5, 2, 2)

      sol shouldBe expect
    }

  }

}
