package ipoemi.hackerrank.practice.algorithms.implementation.sherlock_and_squares

import java.io._

object Solution {

  // Complete the squares function below.
  def squares(a: Int, b: Int): Int = {
    Stream.iterate(1)(_ + 1).map(x => x * x).dropWhile(_ < a).takeWhile(_ <= b).count(_ => true)
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val q = stdin.readLine.trim.toInt

    for (qItr <- 1 to q) {
      val ab = stdin.readLine.split(" ")

      val a = ab(0).trim.toInt

      val b = ab(1).trim.toInt

      val result = squares(a, b)

      printWriter.println(result)
    }

    printWriter.close()
  }
}

