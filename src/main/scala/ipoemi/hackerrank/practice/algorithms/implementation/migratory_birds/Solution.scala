package ipoemi.hackerrank.practice.algorithms.implementation.migratory_birds

import java.io.PrintWriter

object Solution {

  // Complete the migratoryBirds function below.
  def migratoryBirds(n: Int, ar: Array[Int]): Int = {
    val _ = n
    ar.groupBy(identity).toList.minBy(x => (-x._2.count(_ => true), x._1))._1
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = stdin.readLine.trim.toInt

    val ar = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = migratoryBirds(n, ar)

    printWriter.println(result)

    printWriter.close()
  }
}

