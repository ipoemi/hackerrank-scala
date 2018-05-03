package ipoemi.hackerrank.practice.algorithms.implementation.drawingbook

import java.io.PrintWriter

object Solution {

  /*
   * Complete the pageCount function below.
   */
  def pageCount(n: Int, p: Int): Int = {
    /*
     * Write your code here.
     */
    val forward = p / 2
    val backward = (if (n % 2 == 0) n - p + 1 else n - p) / 2
    forward min backward
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val p = stdin.readLine.trim.toInt

    val result = pageCount(n, p)

    printWriter.println(result)

    printWriter.close()
  }
}

