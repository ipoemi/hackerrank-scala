package ipoemi.hackerrank.practice.algorithms.implementation.forming_a_magic_square

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #-1" in {
      val expect = 7
      val s = Array(
        Array(5, 3, 4),
        Array(1, 5, 8),
        Array(6, 4, 2)
      )
      val sol = Solution.formingMagicSquare(s)

      sol shouldBe expect
    }

    "TestCase #0" in {
      val expect = 1
      val s = Array(
        Array(4, 9, 2),
        Array(3, 5, 7),
        Array(8, 1, 5)
      )
      val sol = Solution.formingMagicSquare(s)

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = 4
      val s = Array(
        Array(4, 8, 2),
        Array(4, 5, 7),
        Array(6, 1, 6)
      )
      val sol = Solution.formingMagicSquare(s)

      sol shouldBe expect
    }

  }

}

