package cupbook.examples.chapter4

object TestCSum {
  val cs = ChecksumAccumulator.calc("Welcome to the Scala worksheet")
  
  println(cs)
}