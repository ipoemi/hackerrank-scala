package ipoemi.hackerrank.practice.algorithms.warmup.staircase

object Solution {

  /*
   * Complete the staircase function below.
   */
  def staircase(n: Int): Unit = {
    /*
     * Write your code here.
     */
    (1 to n).foreach(i => println(s"%${n}s".format(List.fill(i)('#').mkString)))
  }

  def main(args: Array[String]): Unit = {
    val scan = scala.io.StdIn

    val n = scan.readLine.trim.toInt

    staircase(n)
  }
}

