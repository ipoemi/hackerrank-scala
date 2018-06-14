package ipoemi.hackerrank.practice.algorithms.implementation.queens_attack_ii

import java.io._

object Solution {

  def void(v: Any): Unit = {
    val _ = v
  }

  val directions = List(
    (-1, 1), (0, 1), (1, 1),
    (-1, 0), (1, 0),
    (-1, -1), (0, -1), (1, -1)
  )

  // Complete the queensAttack function below.
  def queensAttack(n: Int, k: Int, r_q: Int, c_q: Int, obstacles: Array[Array[Int]]): Int = {
    void(k)

    val board = obstacles.foldLeft(Map.empty[(Int, Int), Boolean]) { (b, pos) =>
      b.updated((pos(0), pos(1)), false)
    }

    def movable(r: Int, c: Int): Boolean =
      if (r < 1 || c < 1) false
      else if (r > n || c > n) false
      else board.getOrElse((r, c), true)

    directions.map({ d =>
      Stream.iterate((r_q, c_q))(pos => (pos._1 + d._1, pos._2 + d._2))
        .drop(1)
        .takeWhile((movable _).tupled).count(_ => true)
    }).sum
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val nk = stdin.readLine.split(" ")

    val n = nk(0).trim.toInt

    val k = nk(1).trim.toInt

    val r_qC_q = stdin.readLine.split(" ")

    val r_q = r_qC_q(0).trim.toInt

    val c_q = r_qC_q(1).trim.toInt

    val obstacles = Array.ofDim[Int](k, 2)

    for (i <- 0 until k) {
      obstacles(i) = stdin.readLine.split(" ").map(_.trim.toInt)
    }

    val result = queensAttack(n, k, r_q, c_q, obstacles)

    printWriter.println(result)

    printWriter.close()
  }
}

