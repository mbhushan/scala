//https://www.hackerrank.com/challenges/string-o-permute

object StringPermO {

  def main(args: Array[String]) {
    val lines = scala.io.Source.stdin.getLines
    val T = lines.next.toInt
    for (_ <- 1 to T) {
      val s = lines.next
      val ans = for (i <- 0 until s.length) yield s(i ^ 1)
      println(ans.mkString)
    }
  }
}