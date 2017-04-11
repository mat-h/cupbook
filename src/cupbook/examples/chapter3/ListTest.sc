package cupbook.examples.chapter3

import scala.List

object ListTest {
  val oneTwoThree = List(1,2,3)                   //> oneTwoThree  : List[Int] = List(1, 2, 3)
  val oneTwo = List(1,2)                          //> oneTwo  : List[Int] = List(1, 2)
  val threeFour = List(3,4)                       //> threeFour  : List[Int] = List(3, 4)
  
  val oneTwoThreeFour = oneTwo ::: threeFour      //> oneTwoThreeFour  : List[Int] = List(1, 2, 3, 4)
  
  List(1,2,3,4) == oneTwo.:::(threeFour)          //> res0: Boolean = false
  
  List(1,2,3,4) == threeFour.:::(oneTwo)          //> res1: Boolean = true
  
  println("not mutated " + oneTwo + ", " + threeFour)
                                                  //> not mutated List(1, 2), List(3, 4)
  println("newed list " + oneTwoThreeFour)        //> newed list List(1, 2, 3, 4)
  
  // (new ArrayList()).add("hgoe") javaの場合はmutable
  
  // test cons
  // val oneTwoThree_ = oneTwo :: 3 // 動作しない
  val threeOneTwo = 3 :: oneTwo                   //> threeOneTwo  : List[Int] = List(3, 1, 2)
  val threeOneTwo_ = oneTwo.::(3)                 //> threeOneTwo_  : List[Int] = List(3, 1, 2)
  // val oneTwoThree = onetwo :: 3 = 3.::(onetwo) // 動作しない

	// 3 :: oneTwo == new List(oneTwo, 3)

	List()                                    //> res2: List[Nothing] = List()
	List() == Nil                             //> res3: Boolean = true
	
	Nil.getClass                              //> res4: Class[?0] = class scala.collection.immutable.Nil$
	
	// (3 :: (1 :: (2 :: Nil))
	
	3 :: 1 :: 2 :: Nil == List(3, 1, 2)       //> res5: Boolean = true
	3 :: (oneTwo) // O(1)                     //> res6: List[Int] = List(3, 1, 2)
	Nil :+ 3 :+ 2 :+ 1 // O(N) 毎回newしないでも良い?  //> res7: List[Int] = List(3, 2, 1)
	
	threeOneTwo == 3 :: 1 :: 2 :: Nil         //> res8: Boolean = true
	threeOneTwo == 3 :: 1 :: 2 :: List()      //> res9: Boolean = true
	
	threeOneTwo == (3 :: 1 :: Nil) ::: (2 :: Nil)
                                                  //> res10: Boolean = true
 	threeOneTwo(0)                            //> res11: Int = 3
 	threeOneTwo(1)                            //> res12: Int = 1
 	threeOneTwo(2)                            //> res13: Int = 2
 	// threeOneTwo(3)	// コメントアウトして確かめる
 	
	// threeOneTwo.count() // コメントアウトして確かめる
	threeOneTwo.length                        //> res14: Int = 3
	threeOneTwo.count(x => true)              //> res15: Int = 3
	threeOneTwo.count(x => x % 2 == 0)        //> res16: Int = 1
	threeOneTwo.count(_ != 2)                 //> res17: Int = 2
	threeOneTwo.count(_.toString.length == 1) //> res18: Int = 3
	
	threeOneTwo.drop(2)                       //> res19: List[Int] = List(2)
	// substring(2) // 3文字目以降
	// drop = dropLeft [3,1,]2 =>
	// threeOneTwo.dropLeft(2)
	(threeOneTwo ::: oneTwoThreeFour).dropRight(1)
                                                  //> res20: List[Int] = List(3, 1, 2, 1, 2, 3)
	// 3,1,2,1,2,3[,4]
	threeOneTwo.exists(_ == 3)                //> res21: Boolean = true
	threeOneTwo.exists(_.toString.length == 2)//> res22: Boolean = false
	threeOneTwo.filter(_ == 3)                //> res23: List[Int] = List(3)
	
	val is3 : Int => Boolean = x => x == 3    //> is3  : Int => Boolean = <function1>
	
	threeOneTwo.exists(is3)                   //> res24: Boolean = true
	threeOneTwo.filter(is3)                   //> res25: List[Int] = List(3)
	threeOneTwo.filterNot(is3)                //> res26: List[Int] = List(1, 2)
	threeOneTwo.filter(!is3(_))               //> res27: List[Int] = List(1, 2)
	threeOneTwo.filterNot(!is3(_))            //> res28: List[Int] = List(3)
	
	threeOneTwo.forall(is3)                   //> res29: Boolean = false
	threeOneTwo.forall(_.toString.length == 1)//> res30: Boolean = true
	
	threeOneTwo.foreach(println)              //> 3
                                                  //| 1
                                                  //| 2
	// threeOneTwo.foreach(println(_+1)) // なぜダメか？ヒント(_).+
	threeOneTwo.foreach(x => println(x+1))    //> 4
                                                  //| 2
                                                  //| 3
	threeOneTwo.head                          //> res31: Int = 3
	threeOneTwo.init                          //> res32: List[Int] = List(3, 1)
	threeOneTwo.last                          //> res33: Int = 2
	threeOneTwo.tail                          //> res34: List[Int] = List(1, 2)
	
	threeOneTwo.last == threeOneTwo.reverse.head
                                                  //> res35: Boolean = true
	
	threeOneTwo.isEmpty                       //> res36: Boolean = false
	Nil.isEmpty                               //> res37: Boolean = true
	
	threeOneTwo.map(_+"秒")                    //> res38: List[String] = List(3秒, 1秒, 2秒)
	threeOneTwo.mkString(", ")                //> res39: String = 3, 1, 2
	
	threeOneTwo.reverse                       //> res40: List[Int] = List(2, 1, 3)
	threeOneTwo.reverse.map(_+"秒")            //> res41: List[String] = List(2秒, 1秒, 3秒)
	
	threeOneTwo.sortWith((x, y) => x < y)     //> res42: List[Int] = List(1, 2, 3)
	threeOneTwo.reverse.sortWith((x, y) => x < y)
                                                  //> res43: List[Int] = List(1, 2, 3)
	threeOneTwo.sortWith((x, y) => x < y).reverse
                                                  //> res44: List[Int] = List(3, 2, 1)
	threeOneTwo.sortWith((x, y) => x > y)     //> res45: List[Int] = List(3, 2, 1)

	List("[head]hoge", "[head]fuga").sortWith((s,t) => s.charAt(6).toLower < t.charAt(6).toLower)
                                                  //> res46: List[String] = List([head]fuga, [head]hoge)
}