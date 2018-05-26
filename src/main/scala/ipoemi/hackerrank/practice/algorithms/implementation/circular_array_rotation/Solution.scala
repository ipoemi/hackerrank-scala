package ipoemi.hackerrank.practice.algorithms.implementation.circular_array_rotation

import java.io._

object Solution {

  def void[A](a: A): Unit = (a, ())._2

  // Complete the circularArrayRotation function below.
  def circularArrayRotation(a: Array[Int], k: Int, m: Array[Int]): Array[Int] = {
    m.map(i => (i - k) % a.length).map(i => (i + a.length) % a.length).map(a(_))
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val nkq = stdin.readLine.split(" ")

    val n = nkq(0).trim.toInt

    void(n)

    val k = nkq(1).trim.toInt

    val q = nkq(2).trim.toInt

    val a = stdin.readLine.split(" ").map(_.trim.toInt)

    val m = Array.ofDim[Int](q)

    for (i <- 0 until q) {
      val mItem = stdin.readLine.trim.toInt
      m(i) = mItem
    }

    val result = circularArrayRotation(a, k, m)

    printWriter.println(result.mkString("\n"))

    printWriter.close()
  }
}

