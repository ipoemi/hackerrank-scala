package ipoemi.hackerrank.practice.algorithms.implementation.utopian_tree

import java.io._

object Solution {

  // Complete the utopianTree function below.
  def utopianTree(n: Int): Int = {
    (0 until n).foldLeft(1)((height, cycle) => if (cycle % 2 == 0) height * 2 else height + 1)
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val t = stdin.readLine.trim.toInt

    for (tItr <- 1 to t) {
      val n = stdin.readLine.trim.toInt

      val result = utopianTree(n)

      printWriter.println(result)
    }

    printWriter.close()
  }
}

