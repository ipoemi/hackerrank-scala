package ipoemi.hackerrank.practice.algorithms.warmup.minimaxsum

object Solution {

  /*
   * Complete the miniMaxSum function below.
   */
  def miniMaxSum(arr: Array[Int]): Unit = {
    /*
     * Write your code here.
     */
    val allSum = arr.sum
    val sums = arr.indices.map(i => allSum - arr(i))
    println(sums.min)
    println(sums.max)
  }

  def main(args: Array[String]): Unit = {
    val scan = scala.io.StdIn

    val arr = scan.readLine.split(" ").map(_.trim.toInt)
    miniMaxSum(arr)
  }
}

