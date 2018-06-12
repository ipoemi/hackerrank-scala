package ipoemi.hackerrank.practice.algorithms.implementation.equalize_the_array

import java.io._

object Solution {

  // Complete the equalizeArray function below.
  def equalizeArray(arr: Array[Int]): Int = {
    val m = arr.groupBy(identity).mapValues(_.length)
    val key = m.keys.maxBy(k => m.getOrElse(k, 0))
    arr.length - m.getOrElse(key, 0)
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val _ = stdin.readLine.trim.toInt

    val arr = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = equalizeArray(arr)

    printWriter.println(result)

    printWriter.close()
  }
}

