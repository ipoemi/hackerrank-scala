package ipoemi.hackerrank.practice.algorithms.implementation.electronics_shop

import java.io.PrintWriter

object Solution {

  /*
   * Complete the getMoneySpent function below.
   */
  def getMoneySpent(keyboards: Array[Int], drives: Array[Int], b: Int): Int = {
    /*
     * Write your code here.
     */
    val sortedK = keyboards.sorted.reverse
    val sortedD = drives.sorted.reverse

    if (sortedK.last + sortedD.last > b) -1
    else {
      sortedK.foldLeft(-1) { (max, c) =>
        sortedD.find(_ + c <= b) match {
          case None => max
          case Some(m) => if (m + c > max) m + c else max
        }
      }
    }
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val bnm = stdin.readLine.split(" ")

    val b = bnm(0).trim.toInt

    val (_, _) = (bnm(1).trim.toInt, bnm(2).trim.toInt)

    val keyboards = stdin.readLine.split(" ").map(_.trim.toInt)

    val drives = stdin.readLine.split(" ").map(_.trim.toInt)
    /*
     * The maximum amount of money she can spend on a keyboard and USB drive, or -1 if she can't purchase both items
     */

    val moneySpent = getMoneySpent(keyboards, drives, b)

    printWriter.println(moneySpent)

    printWriter.close()
  }
}

