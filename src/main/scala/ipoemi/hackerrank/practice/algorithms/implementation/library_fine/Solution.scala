package ipoemi.hackerrank.practice.algorithms.implementation.library_fine

import java.io._

object Solution {

  // Complete the libraryFine function below.
  def libraryFine(d1: Int, m1: Int, y1: Int, d2: Int, m2: Int, y2: Int): Int = {
    val yearFine = 10000
    val monthFine = 500
    val dayFine = 15

    val date1 = y1 * 10000 + m1 * 100 + d1
    val date2 = y2 * 10000 + m2 * 100 + d2

    if (date1 <= date2) 0
    else {
      if (y1 > y2) yearFine
      else if (m1 > m2) (m1 - m2) * monthFine
      else (d1 - d2) * dayFine
    }
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val d1M1Y1 = stdin.readLine.split(" ")

    val d1 = d1M1Y1(0).trim.toInt

    val m1 = d1M1Y1(1).trim.toInt

    val y1 = d1M1Y1(2).trim.toInt

    val d2M2Y2 = stdin.readLine.split(" ")

    val d2 = d2M2Y2(0).trim.toInt

    val m2 = d2M2Y2(1).trim.toInt

    val y2 = d2M2Y2(2).trim.toInt

    val result = libraryFine(d1, m1, y1, d2, m2, y2)

    printWriter.println(result)

    printWriter.close()
  }
}

