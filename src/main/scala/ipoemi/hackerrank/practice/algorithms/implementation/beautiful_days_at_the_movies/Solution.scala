package ipoemi.hackerrank.practice.algorithms.implementation.beautiful_days_at_the_movies

import java.io._

object Solution {

  // Complete the beautifulDays function below.
  def beautifulDays(i: Int, j: Int, k: Int): Int = {
    (i to j).map(x => (x.toString.reverse.toInt - x).abs).count(_ % k == 0)
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val ijk = stdin.readLine.split(" ")

    val i = ijk(0).trim.toInt

    val j = ijk(1).trim.toInt

    val k = ijk(2).trim.toInt

    val result = beautifulDays(i, j, k)

    printWriter.println(result)

    printWriter.close()
  }
}

