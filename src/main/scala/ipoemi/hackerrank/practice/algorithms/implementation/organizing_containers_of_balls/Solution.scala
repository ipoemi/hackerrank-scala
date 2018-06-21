package ipoemi.hackerrank.practice.algorithms.implementation.organizing_containers_of_balls

import java.io._

object Solution {

  // Complete the organizingContainers function below.
  def organizingContainers(container: Array[Array[Int]]): String = {
    val containerSum = container.map(_.sum).sorted
    val typeSum = container.indices.map { t =>
      container.indices.map(c => container(c)(t)).sum
    }.sorted
    containerSum.zip(typeSum).dropWhile(x => x._1 == x._2) match {
      case Array() => "Possible"
      case _ => "Impossible"
    }
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val q = stdin.readLine.trim.toInt

    for (qItr <- 1 to q) {
      val n = stdin.readLine.trim.toInt

      val container = Array.ofDim[Int](n, n)

      for (i <- 0 until n) {
        container(i) = stdin.readLine.split(" ").map(_.trim.toInt)
      }

      val result = organizingContainers(container)

      printWriter.println(result)
    }

    printWriter.close()
  }
}


