package ipoemi.hackerrank.practice.algorithms.warmup.staircase

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #-1" in {
      val oStream = new java.io.ByteArrayOutputStream()
      Console.withOut(oStream) {
        Solution.staircase(4)
      }
      val expect = """   #
                     |  ##
                     | ###
                     |####
                     |""".stripMargin

      oStream.toString shouldBe expect
    }

    "TestCase #0" in {
      val oStream = new java.io.ByteArrayOutputStream()
      Console.withOut(oStream) {
        Solution.staircase(6)
      }
      val expect = """     #
                     |    ##
                     |   ###
                     |  ####
                     | #####
                     |######
                     |""".stripMargin

      oStream.toString shouldBe expect
    }

  }

}

