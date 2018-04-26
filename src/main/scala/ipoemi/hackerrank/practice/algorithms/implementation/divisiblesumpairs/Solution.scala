package ipoemi.hackerrank.practice.algorithms.implementation.divisiblesumpairs

import scala.annotation.tailrec

object Solution {

  def divisibleSumPairs(n: Int, k: Int, ar: Array[Int]): Int = {
    // Complete this function
    val _ = () => n
    /*
    val l = ar.toList
    l.scanLeft(l)((x, _) => x.tail).foldLeft(0) { (n, arr) =>
      if (arr.nonEmpty) arr.tail.count(x => (arr.head + x) % k == 0) + n
      else n
    }
    */
    @tailrec
    def aux(l: List[Int], c: Int): Int = l match {
      case Nil => c
      case h :: t => aux(t, c + t.count(x => (x + h) % k == 0))
    }

    aux(ar.toList, 0)
  }

  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val k = sc.nextInt()
    val ar = new Array[Int](n)
    for (ar_i <- 0 to n - 1) {
      ar(ar_i) = sc.nextInt()
    }
    val result = divisibleSumPairs(n, k, ar)
    println(result)
  }
}

