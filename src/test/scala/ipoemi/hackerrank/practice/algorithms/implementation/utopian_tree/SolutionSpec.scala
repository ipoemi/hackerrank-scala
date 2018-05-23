package ipoemi.hackerrank.practice.algorithms.implementation.utopian_tree

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = List(1, 2)
      val sol = List(0, 1).map(Solution.utopianTree)

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = List(7, 6)
      val sol = List(4, 3).map(Solution.utopianTree)

      sol shouldBe expect
    }

  }

}

