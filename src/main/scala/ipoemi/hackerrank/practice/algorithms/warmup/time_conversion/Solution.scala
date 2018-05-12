package ipoemi.hackerrank.practice.algorithms.warmup.time_conversion

import java.io.PrintWriter

object Solution {

  /*
   * Complete the timeConversion function below.
   */
  def timeConversion(s: String): String = {
    /*
     * Write your code here.
     */
    val hh :: mm :: rest = s.split(":").toList
    val ss = rest.head.substring(0, 2)
    val ampm = rest.head.substring(2, 4)
    if (hh == "12" && ampm == "PM") {
      s"$hh:$mm:$ss"
    } else if (hh == "12" && ampm == "AM") {
      s"00:$mm:$ss"
    } else if (ampm == "PM") {
      s"${hh.toInt + 12}:$mm:$ss"
    } else {
      s"$hh:$mm:$ss"
    }
  }

  def main(args: Array[String]): Unit = {
    val scan = scala.io.StdIn

    val fw = new PrintWriter(sys.env("OUTPUT_PATH"))

    val s = scan.readLine

    val result = timeConversion(s)

    fw.println(result)

    fw.close()
  }
}

