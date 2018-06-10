package ipoemi.hackerrank.practice.algorithms.implementation.non_divisible_subset

import java.io._

import scala.annotation.tailrec

object Solution {

  // Complete the nonDivisibleSubset function below.
  def nonDivisibleSubset(k: Int, S: Array[Int]): Int = {
    val m1 = S.toList.map(_ % k).groupBy(identity).mapValues(_.size)
    val m2 = if (k % 2 == 0) m1.updated(k / 2, m1.getOrElse(k / 2, 0) min 1) else m1
    val m3 = m2.updated(0, m2.getOrElse(0, 0) min 1)
    (0 until k / 2 + 1).map { key =>
      m3.getOrElse(key, 0) max m3.getOrElse(k - key, 0)
    }.sum
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val nk = stdin.readLine.split(" ")

    val _ = nk(0).trim.toInt

    val k = nk(1).trim.toInt

    val S = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = nonDivisibleSubset(k, S)

    printWriter.println(result)

    printWriter.close()
  }
}

