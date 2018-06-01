package ipoemi.hackerrank.practice.algorithms.implementation.append_and_delete

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = "Yes"
      val sol = Solution.appendAndDelete("hackerhappy", "hackerrank", 9)

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = "Yes"
      val sol = Solution.appendAndDelete("aba", "aba", 7)

      sol shouldBe expect
    }

    "TestCase #2" in {
      val expect = "No"
      val sol = Solution.appendAndDelete("ashley", "ash", 2)

      sol shouldBe expect
    }

  }

}
