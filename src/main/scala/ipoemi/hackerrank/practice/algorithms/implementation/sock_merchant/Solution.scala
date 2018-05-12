package ipoemi.hackerrank.practice.algorithms.implementation.sock_merchant

object Solution {

  def sockMerchant(n: Int, ar: Array[Int]): Int = {
    // Complete this function
    val _ = n
    val (_, cnt) = ar.foldLeft((Map.empty[Int, Int], 0))((state, c) => state._1.getOrElse(c, 0) match {
      case 1 => (state._1.updated(c, 0), state._2 + 1)
      case _ => (state._1.updated(c, 1), state._2)
    })
    cnt
  }

  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner(System.in)
    val n = sc.nextInt()
    val ar = new Array[Int](n)
    for (ar_i <- 0 to n - 1) {
      ar(ar_i) = sc.nextInt()
    }
    println(sockMerchant(n, ar))
  }
}

