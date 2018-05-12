package ipoemi.hackerrank.practice.algorithms.warmup.plus_minus

object Solution {

  /*
   * Complete the plusMinus function below.
   */
  def plusMinus(arr: Array[Int]): Unit = {
    /*
     * Write your code here.
     */
    val (positive, negative, zero) = arr.foldLeft((0.0, 0.0, 0.0))((r, a) => a match {
      case _ if a > 0 => r.copy(_1 = r._1 + 1)
      case _ if a < 0 => r.copy(_2 = r._2 + 1)
      case _ => r.copy(_3 = r._3 + 1)
    })
    println(f"${positive / arr.length}%.5f")
    println(f"${negative / arr.length}%.5f")
    println(f"${zero / arr.length}%.5f")

  }

  def main(args: Array[String]): Unit = {
    val scan = scala.io.StdIn

    scan.readLine.trim.toInt

    val arr = scan.readLine.split(" ").map(_.trim.toInt)
    plusMinus(arr)
  }
}

