import ammonite.ops._

@main
def main(args: String*): Unit = {
  val packageBase = "ipoemi.hackerrank"
  val category = if (args.nonEmpty) args(0) else ""
  val problemName = if (args.size > 1) args(1) else ""
  val packageName = List(packageBase, category, problemName.toLowerCase.replace(" ", "_")).mkString(".")

  val mainFileName = "Solution.scala"
  val mainFilePath = "src/main/scala/" + packageName.replace(".", "/") + "/" + mainFileName
  val mainFileContent =
    s"""package $packageName
       |
       |object Solution {
       |}
       |""".stripMargin

  val testFileName = "SolutionSpec.scala"
  val testFilePath = "src/test/scala/" + packageName.replace(".", "/") + "/" + testFileName
  val testFileContent =
    s"""package $packageName
       |
       |import org.scalatest._
       |
       |class SolutionSpec extends WordSpecLike with Matchers {
       |
       |  "Solution" must {
       |
       |    "TestCase #0" in {
       |      val expect = ???
       |      val sol = Solution.solve()
       |
       |      sol shouldBe expect
       |    }
       |
       |  }
       |
       |}
       |""".stripMargin

  //mkdir! pwd/RelPath(mainFilePath)
  println(mainFilePath)
  println(mainFileContent)
  if (!exists(pwd/RelPath(mainFilePath))) {
    write(pwd/RelPath(mainFilePath), mainFileContent)
  }

  //mkdir! pwd/RelPath(testFilePath + "_test")
  println(testFilePath)
  println(testFileContent)
  if (!exists(pwd/RelPath(testFilePath))) {
    write(pwd/RelPath(testFilePath), testFileContent)
  }
}
