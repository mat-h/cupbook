package cupbook.examples.chapter1

import scala.math.BigInt

object FactorialBigInt {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def factorial(n : BigInt) : BigInt =
  	if (n==0) 1
  	else n * factorial(n-1)                   //> factorial: (n: scala.math.BigInt)scala.math.BigInt
  	
 	factorial(1)                              //> res0: scala.math.BigInt = 1
 	factorial(2)                              //> res1: scala.math.BigInt = 2
 	
 	factorial(30)                             //> res2: scala.math.BigInt = 265252859812191058636308480000000
}