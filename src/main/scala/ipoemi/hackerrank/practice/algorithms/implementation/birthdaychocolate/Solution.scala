package ipoemi.hackerrank.practice.algorithms.implementation.birthdaychocolate

object Solution {

  def solve(n: Int, s: Array[Int], d: Int, m: Int): Int = {
    val _ = n
    s.sliding(m).map(_.sum == d).count(identity)
  }

  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()
    val s = new Array[Int](n)
    for(s_i <- 0 to n-1) {
      s(s_i) = sc.nextInt()
    }
    val d = sc.nextInt()
    val m = sc.nextInt()
    val result = solve(n, s, d, m)
    println(result)
  }
}

