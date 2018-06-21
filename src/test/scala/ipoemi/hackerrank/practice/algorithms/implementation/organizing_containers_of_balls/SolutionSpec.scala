package ipoemi.hackerrank.practice.algorithms.implementation.organizing_containers_of_balls

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = "Possible"
      val sol = Solution.organizingContainers(Array(
        Array(1, 1),
        Array(1, 1)
      ))

      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = "Impossible"
      val sol = Solution.organizingContainers(Array(
        Array(0, 2),
        Array(1, 1)
      ))

      sol shouldBe expect
    }

  }

}
