package ipoemi.hackerrank.practice.algorithms.implementation.jumping_on_the_clouds

import java.io._

import scala.annotation.tailrec

object Solution {

  // Complete the jumpingOnClouds function below.
  def jumpingOnClouds(c: Array[Int]): Int = {
    @tailrec
    def aux(cs: List[Int], cnt: Int): Int = cs match {
      case _ :: Nil => cnt
      case _ :: _ :: Nil => cnt + 1
      case _ :: _ :: h :: t if h == 0 => aux(h :: t, cnt + 1)
      case _ :: h1 :: h2 :: t if h2 == 1 => aux(h1 :: h2 :: t, cnt + 1)
    }
    aux(c.toList, 0)
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val _ = stdin.readLine.trim.toInt

    val c = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = jumpingOnClouds(c)

    printWriter.println(result)

    printWriter.close()
  }
}

