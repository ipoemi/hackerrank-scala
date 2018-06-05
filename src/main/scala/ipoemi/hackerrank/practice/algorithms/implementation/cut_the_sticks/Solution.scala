package ipoemi.hackerrank.practice.algorithms.implementation.cut_the_sticks

import java.io._

import scala.annotation.tailrec

object Solution {

  // Complete the cutTheSticks function below.
  def cutTheSticks(arr: Array[Int]): Array[Int] = {
    @tailrec
    def aux(xs: List[Int], result: Vector[Int]): Vector[Int] = xs match {
      case Nil => result
      case h :: t => aux(t.dropWhile(_ == h), result :+ xs.size)
    }
    aux(arr.toList.sorted, Vector.empty[Int]).toArray
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val _ = stdin.readLine.trim.toInt

    val arr = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = cutTheSticks(arr)

    printWriter.println(result.mkString("\n"))

    printWriter.close()
  }
}

