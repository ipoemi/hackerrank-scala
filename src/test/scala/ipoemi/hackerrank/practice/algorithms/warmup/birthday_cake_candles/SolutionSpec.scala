package ipoemi.hackerrank.practice.algorithms.warmup.birthday_cake_candles

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 2
      val sol = Solution.birthdayCakeCandles(4, Array(3, 2, 1, 3))

      sol shouldBe expect
    }
  }

}

