package cupbook.examples.chapter6

object TestRational {
  val nibun_no_ichi = new Rational(1, 2)          //> nibun_no_ichi  : cupbook.examples.chapter6.Rational = 1/2
  println(nibun_no_ichi)                          //> 1/2
  
  
  val nibun_no_ichi_yak = new Rational(10, 20)    //> nibun_no_ichi_yak  : cupbook.examples.chapter6.Rational = 1/2
  // println(nibun_no_ichi_yak.g)
  assert(nibun_no_ichi_yak.toString == "1/2")
  
  // val illegal = new Rational(1, 0)
  
  val l = new Rational(1, 3)                      //> l  : cupbook.examples.chapter6.Rational = 1/3
  val g = new Rational(4, 5)                      //> g  : cupbook.examples.chapter6.Rational = 4/5
  
  assert(l.lessThan(g))
  assert(!l.lessThan(l))
  
  new Rational(1, 3) + new Rational(2, 3)         //> res0: cupbook.examples.chapter6.Rational = 1
  new Rational(11, 100) + new Rational(1, 2)      //> res1: cupbook.examples.chapter6.Rational = 61/100
  
  new Rational(1, 2) * 2                          //> res2: cupbook.examples.chapter6.Rational = 1
  
  implicit def intToRational(x: Int) = new Rational(x)
                                                  //> intToRational: (x: Int)cupbook.examples.chapter6.Rational
  2 * new Rational(1, 2)                          //> res3: cupbook.examples.chapter6.Rational = 1
  
  // val r = (new Rational(1, 2))
  // r.numer = 2
  // println(r)
}