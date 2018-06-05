package ipoemi.hackerrank.practice.algorithms.implementation.library_fine

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 45
      val sol = Solution.libraryFine(9, 6, 2015, 6, 6, 2015)

      sol shouldBe expect
    }

  }

}
