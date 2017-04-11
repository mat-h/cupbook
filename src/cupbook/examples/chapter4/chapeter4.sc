package cupbook.examples.chapter4

import scala.io.Source

object chapeter4 {
  val lines = Source.fromFile("/Users/01009752/scala/cupbook/hoge.txt").getLines().toList
                                                  //> lines  : List[String] = List(fuga             hoge, hoge, pige, hyakugyouhya
                                                  //| kugyouhyakugyouhyakugyouhyakugyouhyakugyouhyakugyouhyakugyouhyakugyouhyakugy
                                                  //| ouhyakugyouhyakugyouhyakugyouhyakugyouhyakugyou)
  def width : String => Int = s => s.length.toString.length
                                                  //> width: => String => Int
  /*　ダメなコード
  var maxWidth = 0;
  for (line <- lines) {
  	maxWidth = maxWidth.max(width(line))
  }
  */
  
  val maxWidth = width(lines.reduceLeft((a,b) => if (a.length > b.length) a else b))
                                                  //> maxWidth  : Int = 3
  
  print(maxWidth)                                 //> 3
  
  // val lines2 = Source.fromFile("/Users/01009752/scala/cupbook/hoge.txt").getLines()
  
  for (line <- lines) {
  	val numOfSpaces = maxWidth - width(line)
  	print(" " * numOfSpaces)
  	println(line.length + " " + line)
  }                                               //>  21 fuga             hoge
                                                  //|   4 hoge
                                                  //|   4 pige
                                                  //| 135 hyakugyouhyakugyouhyakugyouhyakugyouhyakugyouhyakugyouhyakugyouhyakugyou
                                                  //| hyakugyouhyakugyouhyakugyouhyakugyouhyakugyouhyakugyouhyakugyou
}