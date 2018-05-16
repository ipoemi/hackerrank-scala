package ipoemi.hackerrank.practice.algorithms.implementation.picking_numbers

import java.io.PrintWriter

import scala.annotation.tailrec

object Solution {

  // Complete the pickingNumbers function below.
  def pickingNumbers(a: Array[Int]): Int = sol2(a)

  def sol1(a: Array[Int]): Int = {
    val sorted = a.sorted.toList

    @tailrec
    def aux(remain: List[Int], maxLength: Int): Int = remain match {
      case Nil => maxLength
      case h :: _ =>
        val diffZero = remain.dropWhile(_ - h == 0)
        val diffLessOne = diffZero.dropWhile(_ - h == 1)
        val length = remain.size - diffLessOne.size
        aux(diffZero, maxLength.max(length))
    }

    aux(sorted, 0)
  }

  def sol2(a: Array[Int]): Int = {
    val sorted = a.sorted.toList
    val keys = sorted.distinct

    keys.foldLeft((0, sorted)) { (state, k) =>
      val maxLength = state._1
      val remain = state._2
      val diffZero = remain.dropWhile(_ - k == 0)
      val diffLessOne = diffZero.dropWhile(_ - k == 1)
      val length = remain.size - diffLessOne.size
      (maxLength max length, diffZero)
    }._1
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val _ = stdin.readLine.trim.toInt

    val a = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = pickingNumbers(a)

    printWriter.println(result)

    printWriter.close()
  }
}

