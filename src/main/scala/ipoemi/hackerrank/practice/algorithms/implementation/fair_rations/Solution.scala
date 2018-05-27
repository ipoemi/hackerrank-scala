package ipoemi.hackerrank.practice.algorithms.implementation.fair_rations

import java.io._

import scala.annotation.tailrec

object Solution {

  // Complete the fairRations function below.
  def fairRations(b: Array[Int]): String = {
    @tailrec
    def aux(xs: List[Boolean], n: Int): Option[Int] = xs match {
      case h :: Nil if !h => None
      case _ :: Nil => Some(n)
      case h :: t if h => aux(t, n)
      case _ :: h2 :: t => aux(!h2 :: t, n + 2)
    }
    aux(b.toList.map(_ % 2 == 0), 0).map(_.toString).getOrElse("NO")
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val _ = stdin.readLine.trim.toInt

    val b = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = fairRations(b)

    printWriter.println(result)

    printWriter.close()
  }
}

