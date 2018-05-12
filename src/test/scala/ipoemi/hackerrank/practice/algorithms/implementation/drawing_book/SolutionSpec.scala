package ipoemi.hackerrank.practice.algorithms.implementation.drawing_book

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 1
      val sol = Solution.pageCount(6, 2)

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = 0
      val sol = Solution.pageCount(5, 4)

      sol shouldBe expect
    }

  }

}

