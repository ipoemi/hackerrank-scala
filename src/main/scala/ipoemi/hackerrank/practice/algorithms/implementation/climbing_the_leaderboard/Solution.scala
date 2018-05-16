package ipoemi.hackerrank.practice.algorithms.implementation.climbing_the_leaderboard

import java.io.PrintWriter

import scala.annotation.tailrec

object Solution {

  // Complete the climbingLeaderboard function below.
  def climbingLeaderboard(scores: Array[Int], alice: Array[Int]): Array[Int] =
    sol7(scores, alice)

  // Not Pass (Timeout)
  def sol1(scores: Array[Int], alice: Array[Int]): Array[Int] = {
    val ndl = scores.distinct
    alice.map(s => ndl.takeWhile(_ > s).length + 1)
  }

  // Not Pass (Timeout)
  def sol1_1(scores: Array[Int], alice: Array[Int]): Array[Int] = {
    val ndl = scores.distinct
    alice.map { s =>
      var i = 0
      while (i < ndl.length && ndl(i) > s) i += 1
      i + 1
    }
  }

  // Not Pass (Timeout)
  def sol2(scores: Array[Int], alice: Array[Int]): Array[Int] = {
    val ndl = scores.distinct.toList
    val (r, _, _) = alice.reverse.foldLeft((List.empty[Int], ndl, 0)) { (state, s) =>
      val result = state._1
      val remain = state._2
      val lastRank = state._3
      val newRemain = remain.dropWhile(_ > s)
      val rank = remain.size - newRemain.size
      ((lastRank + rank + 1) :: result, newRemain, lastRank + rank)
    }
    r.toArray
  }

  // Pass (Using loop, array assign like java)
  def sol3(scores: Array[Int], alice: Array[Int]): Array[Int] = {
    val array = scores.distinct
    val result = Array.ofDim[Int](alice.length)
    var i = array.length - 1
    var break = false
    for (j <- alice.indices) {
      while (i >= 0 && !break) {
        if (alice(j) >= array(i)) i -= 1
        else {
          result(j) = i + 2
          break = true
        }
      }
      if (i < 0) result(j) = 1
      break = false
    }
    result
  }

  // Pass (Using tailrec, array assign)
  def sol4(scores: Array[Int], alice: Array[Int]): Array[Int] = {
    val distinct = scores.distinct

    @tailrec
    def aux(ai: Int, si: Int, result: Array[Int]): Array[Int] = {
      if (ai >= alice.length) result
      else if (si < 0) {
        result.update(ai, 1)
        aux(ai + 1, si, result)
      } else {
        (alice(ai), distinct(si)) match {
          case (l, r) if l >= r => aux(ai, si - 1, result)
          case _ =>
            result.update(ai, si + 2)
            aux(ai + 1, si, result)
        }
      }
    }

    aux(0, distinct.length - 1, Array.ofDim(alice.length))
  }

  // Pass (Using tailrec, immutable vector, 2 indices - less functional)
  def sol5(scores: Array[Int], alice: Array[Int]): Array[Int] = {
    val distinct = scores.distinct

    @tailrec
    def aux(ai: Int, si: Int, result: Vector[Int]): Vector[Int] = {
      if (ai >= alice.length) result
      else if (si < 0) {
        aux(ai + 1, si, result :+ 1)
      } else {
        (alice(ai), distinct(si)) match {
          case (l, r) if l >= r => aux(ai, si - 1, result)
          case _ =>
            aux(ai + 1, si, result :+ (si + 2))
        }
      }
    }

    aux(0, distinct.length - 1, Vector.empty[Int]).toArray

  }

  // Pass (Using tailrec, matcher, immuable vector, 1 index)
  def sol6(scores: Array[Int], alice: Array[Int]): Array[Int] = {
    val distinct = scores.distinct

    @tailrec
    def aux(aliceScores: List[Int], si: Int, result: Vector[Int]): Vector[Int] = aliceScores match {
      case Nil => result
      case _ :: t if si < 0 => aux(t, si, result :+ 1)
      case h :: t =>
        if (h >= distinct(si)) aux(aliceScores, si - 1, result)
        else aux(t, si, result :+ (si + 2))
    }

    aux(alice.toList, distinct.length - 1, Vector.empty[Int]).toArray
  }

  // Pass (Using foldLeft, dropWhile, no index)
  def sol7(scores: Array[Int], alice: Array[Int]): Array[Int] = {
    val ndl = scores.distinct.zipWithIndex.reverse.toList
    val (r, _) = alice.foldLeft((Vector.empty[Int], ndl)) { (state, s) =>
      val result = state._1
      val remainWithRank = state._2
      val newRemain = remainWithRank.dropWhile(_._1 < s)
      if (newRemain.nonEmpty) {
        if (newRemain.head._1 > s) (result :+ (newRemain.head._2 + 2), newRemain)
        else (result :+ newRemain.head._2 + 1, newRemain)
      } else {
        (result :+ 1, newRemain)
      }
    }
    r.toArray
  }


  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val scoresCount = stdin.readLine.trim.toInt

    val scores = stdin.readLine.split(" ").map(_.trim.toInt)
    val aliceCount = stdin.readLine.trim.toInt

    val alice = stdin.readLine.split(" ").map(_.trim.toInt)
    val result = climbingLeaderboard(scores, alice)

    val (_, _) = (scoresCount, aliceCount)

    printWriter.println(result.mkString("\n"))

    printWriter.close()
  }
}

