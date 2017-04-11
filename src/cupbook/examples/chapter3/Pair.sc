package cupbook.examples.chapter3

object Pair {
  val p = (22, "twenty-two")                      //> p  : (Int, String) = (22,twenty-two)
  p._1                                            //> res0: Int = 22
  p._2                                            //> res1: String = twenty-two
  
  p.getClass                                      //> res2: Class[?0] = class scala.Tuple2
  // (Int,String) = Tuple2[Int, String]
  
  val pp = (22, "tw", List(), 1 to 10)            //> pp  : (Int, String, List[Nothing], scala.collection.immutable.Range.Inclusiv
                                                  //| e) = (22,tw,List(),Range(1, 2, 3, 4, 5, 6, 7, 8, 9, 10))
	// Tuple4[Int, String...]
	pp._4(5)                                  //> res3: Int = 6
  
  // p(0) // 動作しない
  // p._0 // 動作しない
}