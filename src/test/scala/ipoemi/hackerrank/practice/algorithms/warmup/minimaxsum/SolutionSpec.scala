package ipoemi.hackerrank.practice.algorithms.warmup.minimaxsum

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val oStream = new java.io.ByteArrayOutputStream()
      Console.withOut(oStream) {
        Solution.miniMaxSum(Array(1, 2, 3, 4, 5))
      }
      val expectLines = scala.io.Source.fromString(oStream.toString).getLines()
      val solLines = scala.io.Source.fromString("10\n14").getLines()

      expectLines.next() shouldBe solLines.next()
      expectLines.next() shouldBe solLines.next()
    }
  }

}

