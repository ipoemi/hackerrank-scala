package ipoemi.hackerrank.practice.algorithms.implementation.angry_professor

import java.io._

object Solution {

  // Complete the angryProfessor function below.
  def angryProfessor(k: Int, a: Array[Int]): String = {
    if (a.count(_ <= 0) >= k) "NO"
    else "YES"
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val t = stdin.readLine.trim.toInt

    for (tItr <- 1 to t) {
      val nk = stdin.readLine.split(" ")

      val _ = nk(0).trim.toInt

      val k = nk(1).trim.toInt

      val a = stdin.readLine.split(" ").map(_.trim.toInt)
      val result = angryProfessor(k, a)

      printWriter.println(result)
    }

    printWriter.close()
  }
}

