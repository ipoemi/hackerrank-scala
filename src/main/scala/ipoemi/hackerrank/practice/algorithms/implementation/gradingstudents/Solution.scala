package ipoemi.hackerrank.practice.algorithms.implementation.gradingstudents

import java.io.PrintWriter

object Solution {

  /*
   * Complete the gradingStudents function below.
   */
  def gradingStudents(grades: Array[Int]): Array[Int] = {
    /*
     * Write your code here.
     */
    val ret = Array.ofDim[Int](grades.length)
    for (i <- grades.indices) {
      if (grades(i) >= 38 && (grades(i) % 5) >= 3)
        ret(i) = (grades(i) / 5 + 1) * 5
      else
        ret(i) = grades(i)
    }
    ret
  }

  def main(args: Array[String]): Unit = {
    val scan = scala.io.StdIn

    val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

    val n = scan.readLine.trim.toInt

    val grades = Array.ofDim[Int](n)

    for (gradesItr <- 0 until n) {
      val gradesItem = scan.readLine.trim.toInt
      grades(gradesItr) = gradesItem}

    val result = gradingStudents(grades)

    fw.println(result.mkString("\n"))

    fw.close()
  }
}

