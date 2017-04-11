package cupbook.examples.chapter2

object chapter2 {
  1 + 2                                           //> res0: Int(3) = 3

  // res0 * 3	// scala worksheet では動作しない
  
  val msg = "Hello, World!"                       //> msg  : String = Hello, World!
  val msg2 : java.lang.String = "Hello, world again!"
                                                  //> msg2  : String = Hello, world again!
	// msg = "Goodbye cruel world!" // 動作しない
	
	var greeting = "Hello, World!"            //> greeting  : String = Hello, World!
	greeting = "Leave me alone, World!"

	greeting                                  //> res1: String = Leave me alone, World!
	
	val multiline =
		"This is the next line."          //> multiline  : String = This is the next line.
	                          
	val emptyLine =
	
		"One Empty Line."                 //> emptyLine  : String = One Empty Line.
		
	def max(x: Int, y: Int) : Int = {
		if (x > y) x else y
	}                                         //> max: (x: Int, y: Int)Int
	def max_s(x: Int, y: Int) = if (x > y) x else y
                                                  //> max_s: (x: Int, y: Int)Int
	
	max(3, 5)                                 //> res2: Int = 5
	
	def max_with_print(x: Int, y: Int) = {
		if (x > y) x else {
			println("returning y")
			y
		}
	}                                         //> max_with_print: (x: Int, y: Int)Int
	
	max_with_print(3, 5)                      //> returning y
                                                  //| res3: Int = 5

}