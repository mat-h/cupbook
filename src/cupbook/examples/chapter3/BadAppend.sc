package cupbook.examples.chapter3

object BadAppend {
  val start = System.currentTimeMillis()
  
  Nil :+ 1
  
  (0 to 100).foldLeft(List.empty[Int])((x, i) => x :+ i)
  
  // (0 to 10000).foldLeft(List.empty[Int])((x, i) => x :+ i) // コメントアウトして実行してみる
  
  // (0 to 100000).foldLeft(List.empty[Int])((x, i) => x :+ i) // 帰ってこないかも
  
  System.currentTimeMillis() - start // 実行時間(ミリ秒)

}