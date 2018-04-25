package ipoemi.hackerrank.practice.algorithms.implementation.gradingstudents

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = Array(75, 67, 40, 33)
      val sol = Solution.gradingStudents(Array(73, 67, 38, 33))

      sol shouldBe expect
    }
  }

}

