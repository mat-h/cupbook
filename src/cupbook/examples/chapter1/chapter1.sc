package cupbook.examples.chapter1

import cupbook.examples.chapter1.MyClass
import java.util.HashMap

object chapter1 {
  println("1章の本文のコードです。")                         //> 1章の本文のコードです。
  
  var capital = Map ("US" -> "Washington", "France" -> "Paris")
                                                  //> capital  : scala.collection.immutable.Map[String,String] = Map(US -> Washing
                                                  //| ton, France -> Paris)
  capital += ("Japan" -> "Tokyo")
  println(capital("France"))                      //> Paris
  
  // additional code
  capital("France")                               //> res0: String = Paris
  capital.get("France")                           //> res1: Option[String] = Some(Paris)
  capital.get("Thailand")                         //> res2: Option[String] = None
  // 例外を投げさせることも可能
  // capital("Thailand")
  capital.toSeq(0)                                //> res3: (String, String) = (US,Washington)
  
  // p41 簡潔性
  val my = new MyClass(0, "zero")                 //> my  : cupbook.examples.chapter1.MyClass = cupbook.examples.chapter1.MyClass@
                                                  //| 32e6e9c3
  my.index = 1
  my.name = "one"
  println(my)                                     //> cupbook.examples.chapter1.MyClass@32e6e9c3
  println(my.index)                               //> 1
  println(my.name)                                //> one
  
 	// p42 関数
 	val name = "Octocat"                      //> name  : String = Octocat
 	val _name = "_octocat"                    //> _name  : String = _octocat
 	name.exists(_.isUpper)                    //> res4: Boolean = true
 	_name.exists(_.isUpper)                   //> res5: Boolean = false
 	
 	// p44 型推論
 	val x = new HashMap[Int, String]()        //> x  : java.util.HashMap[Int,String] = {}
 	val y : java.util.Map[Int, String] = new HashMap()
                                                  //> y  : java.util.Map[Int,String] = {}
 	
}