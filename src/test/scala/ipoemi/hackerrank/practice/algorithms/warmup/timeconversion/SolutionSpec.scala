package ipoemi.hackerrank.practice.algorithms.warmup.timeconversion

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = "19:05:45"
      val sol = Solution.timeConversion("07:05:45PM")

      sol shouldBe expect
    }
  }

}

