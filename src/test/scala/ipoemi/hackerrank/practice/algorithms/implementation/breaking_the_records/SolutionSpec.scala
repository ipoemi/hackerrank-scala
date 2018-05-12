package ipoemi.hackerrank.practice.algorithms.implementation.breaking_the_records

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = Array(2, 4)
      val sol = Solution.breakingRecords(Array(10, 5, 20, 20, 4, 5, 2, 25, 1))

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = Array(4, 0)
      val sol = Solution.breakingRecords(Array(3, 4, 21, 36, 10, 28, 35, 5, 24, 42))

      sol shouldBe expect
    }
  }

}

