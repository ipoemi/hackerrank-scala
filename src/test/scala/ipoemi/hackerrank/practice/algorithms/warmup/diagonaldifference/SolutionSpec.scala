package ipoemi.hackerrank.practice.algorithms.warmup.diagonaldifference

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      Solution.diagonalDifference(
        Array(
          Array(11, 2, 4),
          Array(4, 5, 6),
          Array(10, 8, -12))
      ) shouldBe 15
    }

  }

}

