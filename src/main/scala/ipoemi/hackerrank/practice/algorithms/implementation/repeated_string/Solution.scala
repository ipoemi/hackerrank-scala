package ipoemi.hackerrank.practice.algorithms.implementation.repeated_string

import java.io._

object Solution {

  // Complete the repeatedString function below.
  def repeatedString(s: String, n: Long): Long = {
    val chars = s.toList
    val cntA = chars.count(_ == 'a')
    val length = s.length
    (n / length) * cntA + chars.take((n % length).toInt).count(_ == 'a')
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val s = stdin.readLine

    val n = stdin.readLine.trim.toLong

    val result = repeatedString(s, n)

    printWriter.println(result)

    printWriter.close()
  }
}

