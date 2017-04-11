package cupbook.examples.chapter8

object Chapter8 {

	def sum = (_:Int) + (_:Int) + (_:Int)     //> sum: => (Int, Int, Int) => Int
	val partial1 = (x:Int) => sum(1, x, 3)    //> partial1  : Int => Int = <function1>
	val partial2 = sum(1, (_:Int), 3)         //> partial2  : Int => Int = <function1>
	
	val zenbu = sum _                         //> zenbu  : () => (Int, Int, Int) => Int = <function0>
	
	def sum2(a:Int, b:Int, c:Int) = a+b+c     //> sum2: (a: Int, b: Int, c: Int)Int
	val zenbu2 = sum _                        //> zenbu2  : () => (Int, Int, Int) => Int = <function0>
	
	partial1(5)                               //> res0: Int = 9
	partial2(5)                               //> res1: Int = 9
	zenbu()(1,2,3)                            //> res2: Int = 6
	
	println                                   //> 
	
	def echo(args: String*) =
		for (a <- args) println(a)        //> echo: (args: String*)Unit
	
	echo("one")                               //> one
	echo("one", "two")                        //> one
                                                  //| two
	echo(Array("one", "two", "three") : _*)   //> one
                                                  //| two
                                                  //| three
	echo(Seq("one", "two", "three") : _*)     //> one
                                                  //| two
                                                  //| three
  def speed (distance: Float, time: Float = 1) = distance/time
                                                  //> speed: (distance: Float, time: Float)Float
  
  speed(distance=10)                              //> res3: Float = 10.0
  speed(distance=10,time=10)                      //> res4: Float = 1.0
}