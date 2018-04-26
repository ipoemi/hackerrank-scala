package ipoemi.hackerrank.practice.algorithms.implementation.kangaroo

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = "YES"
      val sol = Solution.kangaroo(0, 3, 4, 2)

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = "NO"
      val sol = Solution.kangaroo(0, 2, 5, 3)

      sol shouldBe expect
    }
  }

}

