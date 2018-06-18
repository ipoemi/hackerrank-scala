package ipoemi.hackerrank.practice.algorithms.implementation.taum_and_bday

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 20
      val sol = Solution.taumBday(10, 10, 1, 1, 1)

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = 37
      val sol = Solution.taumBday(5, 9, 2, 3, 4)

      sol shouldBe expect
    }

    "TestCase #2" in {
      val expect = 12
      val sol = Solution.taumBday(3, 6, 9, 1, 1)

      sol shouldBe expect
    }

    "TestCase #3" in {
      val expect = 35
      val sol = Solution.taumBday(7, 7, 4, 2, 1)

      sol shouldBe expect
    }

    "TestCase #4" in {
      val expect = 12
      val sol = Solution.taumBday(3, 3, 1, 9, 2)

      sol shouldBe expect
    }

  }

}
