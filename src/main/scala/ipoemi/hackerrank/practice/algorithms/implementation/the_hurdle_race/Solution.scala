package ipoemi.hackerrank.practice.algorithms.implementation.the_hurdle_race

import java.io.PrintWriter

object Solution {

  // Complete the hurdleRace function below.
  def hurdleRace(k: Int, height: Array[Int]): Int = {
    (height.max - k) max 0
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val nk = stdin.readLine.split(" ")

    val _ = nk(0).trim.toInt

    val k = nk(1).trim.toInt

    val height = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = hurdleRace(k, height)

    printWriter.println(result)

    printWriter.close()
  }
}

