package ipoemi.hackerrank.practice.algorithms.implementation.countingvalleys

object Solution {

  def countingValleys(n: Int, s: String): Int =  {
    // Complete this function
    val _ = n
    val (_, cnt) = s.foldLeft((0, 0)){ (state, ch) =>
      val height0 = state._1
      val cnt0 = state._2
      val height1 = if (ch == 'U') height0 + 1 else height0 - 1
      val cnt1 = if (height1 == 0 && height0 < 0) cnt0 + 1 else cnt0
      (height1, cnt1)
    }
    cnt
  }

  def main(args: Array[String]): Unit = {
    val sc = new java.util.Scanner (System.in)
    val n = sc.nextInt()
    val s = sc.next()
    val result = countingValleys(n, s)
    println(result)
  }
}

