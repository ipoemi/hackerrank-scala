package ipoemi.hackerrank.practice.algorithms.implementation.viral_advertising

import java.io._

object Solution {

  // Complete the viralAdvertising function below.
  def viralAdvertising(n: Int): Int = {
    Stream.iterate(2.0)(x => (x * 3 / 2).floor).take(n).sum.toInt
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val result = viralAdvertising(n)

    printWriter.println(result)

    printWriter.close()
  }
}

