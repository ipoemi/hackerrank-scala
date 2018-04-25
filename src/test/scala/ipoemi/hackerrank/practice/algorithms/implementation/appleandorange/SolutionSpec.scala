package ipoemi.hackerrank.practice.algorithms.implementation.appleandorange

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val oStream = new java.io.ByteArrayOutputStream()
      Console.withOut(oStream) {
        Solution.countApplesAndOranges(7, 11, 5, 15, Array(-2, 2, 1), Array(5, -6))
      }
      val expect = """1
                     |1
                     |""".stripMargin

      oStream.toString shouldBe expect
    }

  }

}

