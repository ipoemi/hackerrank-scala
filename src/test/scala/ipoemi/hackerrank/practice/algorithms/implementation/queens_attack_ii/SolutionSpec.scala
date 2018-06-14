package ipoemi.hackerrank.practice.algorithms.implementation.queens_attack_ii

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 9
      val sol = Solution.queensAttack(4, 0, 4, 4, Array())

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = 10
      val sol = Solution.queensAttack(5, 3, 4, 3, Array(Array(5, 5), Array(4, 2), Array(2, 3)))

      sol shouldBe expect
    }

    "TestCase #2" in {
      val expect = 0
      val sol = Solution.queensAttack(1, 0, 1, 1, Array())

      sol shouldBe expect
    }

  }

}
