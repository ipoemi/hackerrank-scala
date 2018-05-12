package ipoemi.hackerrank.practice.algorithms.implementation.bon_appetit

// main method in "Solution" will be run as your answer
object Solution {

  def bonappetit(k: Int, bill: Array[Int], b: Int): Unit = {
    val halfSum = (for (i <- bill.indices if i != k) yield bill(i)).sum / 2
    if (b - halfSum == 0) println("Bon Appetit") else println(b - halfSum)
  }

  def main(args: Array[String]): Unit = {
    //Enter your code here. Read input from STDIN. Print output to STDOUT
    val input = scala.io.Source.stdin
    val inputLines = input.getLines()
    val _ :: k :: Nil = inputLines.next().split(" ").toList.map(_.toInt)
    val bill = inputLines.next().split(" ").map(_.toInt)
    val b = inputLines.next().toInt
    bonappetit(k, bill, b)
  }

}

