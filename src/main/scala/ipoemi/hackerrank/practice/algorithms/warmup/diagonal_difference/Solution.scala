package ipoemi.hackerrank.practice.algorithms.warmup.diagonal_difference

import java.io.PrintWriter

import scala.annotation.tailrec

object Solution {

  /*
   * Complete the diagonalDifference function below.
   */
  def diagonalDifference(a: Array[Array[Int]]): Int = {
    /*
     * Write your code here.
     */
    val (_, l, r) = a.foldLeft((0, 0, 0)) { (state, row) =>
      (state._1 + 1, row(state._1) + state._2, row(a.length - state._1 - 1) + state._3)
    }
    Math.abs(l - r)
  }

  def main(args: Array[String]): Unit = {
    val scan = scala.io.StdIn

    val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = scan.readLine.trim.toInt

    val a = Array.ofDim[Int](n, n)

    for (aRowItr <- 0 until n) {
      a(aRowItr) = scan.readLine.split(" ").map(_.trim.toInt)
    }

    val result = diagonalDifference(a)

    fw.println(result)

    fw.close()
  }

}
