package ipoemi.hackerrank.practice.algorithms.warmup.plus_minus

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    def absoluteEquals(d1: Double, d2: Double): Boolean =
      Math.abs(d1 - d2) < 1E-4


    "TestCase #0" in {
      val oStream = new java.io.ByteArrayOutputStream()
      Console.withOut(oStream) {
        Solution.plusMinus(Array(-4, 3, -9, 0, 4, 1))
      }
      val source = scala.io.Source.fromString(oStream.toString)
      val lines = source.getLines().toList

      absoluteEquals(lines.head.toDouble, 0.500000) shouldBe true
      absoluteEquals(lines(1).toDouble, 0.333333) shouldBe true
      absoluteEquals(lines(2).toDouble, 0.166667) shouldBe true
    }

  }

}

