package cupbook.examples.chapter3

object chapter3 {
 	val greets = new Array[String](3)         //> greets  : Array[String] = Array(null, null, null)
 	// val greets_empty = new Array[String]() // 動作しない
 	
 	greets(0) = "Hello"
 	greets(1) = ", "
 	greets(2) = "World!\n"
 	
 	greets.foreach(println)                   //> Hello
                                                  //| , 
                                                  //| World!
                                                  //| 
  greets.apply(1)                                 //> res0: String = ", "
  // greets.apply(1) = "????" // 動作しない
  
  val greetStrings : Array[String] = new Array[String](3)
                                                  //> greetStrings  : Array[String] = Array(null, null, null)
  greets.update(0, "GoodBye")
  greets.foreach(println)                         //> GoodBye
                                                  //| , 
                                                  //| World!
                                                  //| 
  greets(0) = "Hello again"
  greets.foreach(println)                         //> Hello again
                                                  //| , 
                                                  //| World!
                                                  //| 
 	val greetApply = Array.apply("Hello", ", ", "World!\n")
                                                  //> greetApply  : Array[String] = Array(Hello, ", ", "World!
                                                  //| ")
 	greetApply.foreach(println)               //> Hello
                                                  //| , 
                                                  //| World!
                                                  //| 
}