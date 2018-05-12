package ipoemi.hackerrank.practice.algorithms.implementation.migratory_birds

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 4
      val sol = Solution.migratoryBirds(6, Array(1, 4, 4, 4, 5, 3))

      sol shouldBe expect
    }
  }

}

