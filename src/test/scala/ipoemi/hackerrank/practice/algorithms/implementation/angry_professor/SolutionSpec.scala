package ipoemi.hackerrank.practice.algorithms.implementation.angry_professor

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = "YES"
      val sol = Solution.angryProfessor(3, Array(-1, -3, 4, 2))

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = "NO"
      val sol = Solution.angryProfessor(2, Array(0, -1, 2, 1))

      sol shouldBe expect
    }

  }

}

