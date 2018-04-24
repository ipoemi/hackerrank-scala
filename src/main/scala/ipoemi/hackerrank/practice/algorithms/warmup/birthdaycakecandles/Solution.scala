package ipoemi.hackerrank.practice.algorithms.warmup.birthdaycakecandles

import java.io.PrintWriter

object Solution {

  /*
   * Complete the birthdayCakeCandles function below.
   */
  def birthdayCakeCandles(n: Int, ar: Array[Int]): Int = {
    /*
     * Write your code here.
     */
    val _ = n // for warning
    val max = ar.max
    ar.count(_ == max)
  }

  def main(args: Array[String]): Unit = {
    val scan = scala.io.StdIn

    val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = scan.readLine.trim.toInt

    val ar = scan.readLine.split(" ").map(_.trim.toInt)
    val result = birthdayCakeCandles(n, ar)

    fw.println(result)

    fw.close()
  }
}

