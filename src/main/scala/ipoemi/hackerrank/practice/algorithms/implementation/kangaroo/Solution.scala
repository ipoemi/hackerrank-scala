package ipoemi.hackerrank.practice.algorithms.implementation.kangaroo

import scala.annotation.tailrec

object Solution {

  @tailrec
  def kangaroo(x1: Int, v1: Int, x2: Int, v2: Int): String =
    if (x1 == x2) "YES"
    else if (v2 > v1) kangaroo(x2, v2, x1, v1)
    else {
      if (x1 > x2) "NO"
      else kangaroo(x1 + v1, v1, x2 + v2, v2)
    }

  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val x1 = sc.nextInt()
    val v1 = sc.nextInt()
    val x2 = sc.nextInt()
    val v2 = sc.nextInt()
    println(kangaroo(x1, v1, x2, v2))
  }
}

