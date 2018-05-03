package ipoemi.hackerrank.practice.algorithms.implementation.sockmerchant

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 3
      val sol = Solution.sockMerchant(9, Array(10, 20, 20, 10, 10, 30, 50, 10, 20))

      sol shouldBe expect
    }
  }

}

