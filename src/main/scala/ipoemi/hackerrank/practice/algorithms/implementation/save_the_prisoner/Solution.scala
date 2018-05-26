package ipoemi.hackerrank.practice.algorithms.implementation.save_the_prisoner

import java.io._

object Solution {

  // Complete the saveThePrisoner function below.
  def saveThePrisoner(n: Int, m: Int, s: Int): Int = (m + s - 2) % n + 1

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val t = stdin.readLine.trim.toInt

    for (tItr <- 1 to t) {
      val nms = stdin.readLine.split(" ")

      val n = nms(0).trim.toInt

      val m = nms(1).trim.toInt

      val s = nms(2).trim.toInt

      val result = saveThePrisoner(n, m, s)

      printWriter.println(result)
    }

    printWriter.close()
  }
}

