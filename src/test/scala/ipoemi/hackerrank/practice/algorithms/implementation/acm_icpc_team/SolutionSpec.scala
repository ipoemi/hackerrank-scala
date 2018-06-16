package ipoemi.hackerrank.practice.algorithms.implementation.acm_icpc_team

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = Array(5, 1)
      val sol = Solution.acmTeam(Array(
        "10101",
        "11110",
        "00010"
      ))

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = Array(5, 2)
      val sol = Solution.acmTeam(Array(
        "10101",
        "11100",
        "11010",
        "00101"
      ))

      sol shouldBe expect
    }

  }

}
