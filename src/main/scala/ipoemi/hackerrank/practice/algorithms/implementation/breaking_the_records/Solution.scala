package ipoemi.hackerrank.practice.algorithms.implementation.breaking_the_records

import java.io.PrintWriter

object Solution {

  /*
   * Complete the breakingRecords function below.
   */
  def breakingRecords(score: Array[Int]): Array[Int] = {
    /*
     * Write your code here.
     */
    val (_, minCnt0, _, maxCnt0) = score.tail.foldLeft((score.head, 0, score.head, 0)) { case ((min, minCnt, max, maxCnt), s) =>
      if (s < min) (s, minCnt + 1, max, maxCnt)
      else if (s > max) (min, minCnt, s, maxCnt + 1)
      else (min, minCnt, max, maxCnt)
    }
    Array(maxCnt0, minCnt0)
  }

  def main(args: Array[String]): Unit = {
    val scan = scala.io.StdIn

    val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

    val _ = scan.readLine.trim.toInt

    val score = scan.readLine.split(" ").map(_.trim.toInt)
    val result = breakingRecords(score)

    fw.println(result.mkString(" "))

    fw.close()
  }
}
