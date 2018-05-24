
package ipoemi.hackerrank.practice.algorithms.implementation.beautiful_days_at_the_movies

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 2
      val sol = Solution.beautifulDays(20, 23, 6)

      sol shouldBe expect
    }

  }

}
