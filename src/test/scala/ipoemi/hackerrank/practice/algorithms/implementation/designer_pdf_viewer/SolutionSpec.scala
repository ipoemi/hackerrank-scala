package ipoemi.hackerrank.practice.algorithms.implementation.designer_pdf_viewer

import org.scalatest._

class SolutionSpec extends WordSpecLike with Matchers {

  "Solution" must {

    "TestCase #0" in {
      val expect = 9
      val array = Array(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5)
      val sol = Solution.designerPdfViewer(array, "abc")
      sol shouldBe expect
    }

    "TestCase #1" in {
      val expect = 28
      val array = Array(1, 3, 1, 3, 1, 4, 1, 3, 2, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 5, 7)
      val sol = Solution.designerPdfViewer(array, "zabc")
      sol shouldBe expect
    }

  }

}

