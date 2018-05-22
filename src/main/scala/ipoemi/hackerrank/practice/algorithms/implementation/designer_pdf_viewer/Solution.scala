package ipoemi.hackerrank.practice.algorithms.implementation.designer_pdf_viewer

import java.io.PrintWriter

object Solution {

  // Complete the designerPdfViewer function below.
  def designerPdfViewer(h: Array[Int], word: String): Int = {
    val maxHeight = word.map(c => h(c.toInt - 97)).max
    word.length * maxHeight
  }

  def main(args: Array[String]): Unit = {
    val stdin = scala.io.StdIn

    val printWriter = new PrintWriter(sys.env("OUTPUT_PATH"))

    val h = stdin.readLine.split(" ").map(_.trim.toInt)
    val word = stdin.readLine

    val result = designerPdfViewer(h, word)

    printWriter.println(result)

    printWriter.close()
  }
}

