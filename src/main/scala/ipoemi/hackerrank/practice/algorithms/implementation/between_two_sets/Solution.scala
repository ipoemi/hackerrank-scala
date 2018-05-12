package ipoemi.hackerrank.practice.algorithms.implementation.between_two_sets

import java.io.PrintWriter

import scala.annotation.tailrec

object Solution {

  /*
   * Complete the getTotalX function below.
   */
  def getTotalX(a: Array[Int], b: Array[Int]): Int = {
    /*
     * Write your code here.
     */
    val gcm0 = a.reduceLeft((n, m) => gcm(n, m))
    val gcd0 = b.reduceLeft((n, m) => gcd(n, m))

    Stream.iterate(gcm0)(_ + gcm0).takeWhile(_ <= gcd0).filter(gcd0 % _ == 0).count(_ => true)
  }

  @tailrec
  def gcd(m: Int, n: Int): Int = {
    val r = m % n
    if (r == 0) n
    else gcd(n, r)
  }

  def gcm(m: Int, n: Int): Int = {
    m * n / gcd(m, n)
  }

  def main(args: Array[String]): Unit = {
    val scan = scala.io.StdIn

    val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

    val nm = scan.readLine.split(" ")

    val n = nm(0).trim.toInt

    val m = nm(1).trim.toInt

    n == m

    val a = scan.readLine.split(" ").map(_.trim.toInt)

    val b = scan.readLine.split(" ").map(_.trim.toInt)
    val total = getTotalX(a, b)

    fw.println(total)

    fw.close()
  }
}

