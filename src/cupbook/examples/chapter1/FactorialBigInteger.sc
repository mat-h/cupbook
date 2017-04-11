package cupbook.examples.chapter1

import java.math.BigInteger

object FactorialBigInteger {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  def factorial(x : BigInteger) : BigInteger =
  	if (x == BigInteger.valueOf(0)) BigInteger.valueOf(1)
  	else x.multiply(factorial(x.subtract(BigInteger.valueOf(1))))
                                                  //> factorial: (x: java.math.BigInteger)java.math.BigInteger
              
  factorial(BigInteger.valueOf(0))                //> res0: java.math.BigInteger = 1
  factorial(BigInteger.valueOf(1))                //> res1: java.math.BigInteger = 1
  
  factorial(BigInteger.valueOf(30))               //> res2: java.math.BigInteger = 265252859812191058636308480000000
}