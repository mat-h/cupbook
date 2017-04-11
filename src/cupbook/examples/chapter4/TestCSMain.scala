package cupbook.examples.chapter4

import ChecksumAccumulator.calc

// class TestCSMain {}

object TestCSMain extends App { // <- scalaが自動生成後TestCSMain$.INSTACEに格納

  // def main(args: Array[String]) { // <- staticメソッドではない

    val cs = ChecksumAccumulator.calc("Welcome to the Scala worksheet")

    println(cs)

  // }
}