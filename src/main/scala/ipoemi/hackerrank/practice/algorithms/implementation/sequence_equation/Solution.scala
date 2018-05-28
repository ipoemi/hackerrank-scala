package ipoemi.hackerrank.practice.algorithms.implementation.sequence_equation

import java.io._

object Solution {

  // Complete the permutationEquation function below.
  def permutationEquation(p: Array[Int]): Array[Int] = {
    sol2(p)
  }

  def sol1(p: Array[Int]): Array[Int] = {
    val inv = p.map(_ - 1).zipWithIndex.sortBy(x => x._1).map(_._2)
    Array.range(0, p.length).map(x => inv(inv(x)) + 1)
  }

  def sol2(p: Array[Int]): Array[Int] = {
    val inv = p.indices.foldLeft(Map.empty[Int, Int])((m, i) => m.updated(p(i), i + 1))
    Array.range(0, p.length).map(x => inv(inv(x + 1)))
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val _ = stdin.readLine.trim.toInt

    val p = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = permutationEquation(p)

    printWriter.println(result.mkString("\n"))

    printWriter.close()
  }
}

