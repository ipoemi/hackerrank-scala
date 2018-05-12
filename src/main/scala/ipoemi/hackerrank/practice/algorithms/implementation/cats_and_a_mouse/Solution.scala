package ipoemi.hackerrank.practice.algorithms.implementation.cats_and_a_mouse

import java.io.PrintWriter

object Solution {


  /*
   * Complete the catAndMouse function below.
   */
  def catAndMouse(x: Int, y: Int, z: Int): String = {
    /*
     * Write your code here.
     */
    val diffX = Math.abs(x - z)
    val diffY = Math.abs(y - z)
    if (diffX < diffY) "Cat A"
    else if (diffX > diffY) "Cat B"
    else "Mouse C"
  }


  def main(args: Array[String]): Unit = {
    val scan = scala.io.StdIn

    val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

    val q = scan.readLine.trim.toInt

    for (qItr <- 1 to q) {
      val xyz = scan.readLine.split(" ")

      val x = xyz(0).trim.toInt

      val y = xyz(1).trim.toInt

      val z = xyz(2).trim.toInt

      val result = catAndMouse(x, y, z)

      fw.println(result)
    }

    fw.close()
  }
}

