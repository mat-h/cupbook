package cupbook.examples.chapter10

object testelement {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  val elem = new ArrayElement(Array("hoge", "fuga", "pigeo"))
                                                  //> elem  : cupbook.examples.chapter10.ArrayElement = hoge
                                                  //| fuga
                                                  //| pigeo
  println(elem.height)                            //> 3
  println(elem.width)                             //> 5
  val elem2 = new LineElement("hogefugapige")     //> elem2  : cupbook.examples.chapter10.LineElement = hogefugapige
  
  println(elem2.height)                           //> 1
  println(elem2.width)                            //> 12
  
  val elem3 = new LineElement2("hogefugapige")    //> elem3  : cupbook.examples.chapter10.LineElement2 = hogefugapige
  
  println(elem3.height)                           //> 1
  println(elem3.width)                            //> 12
  
  elem.beside(elem2)                              //> res0: cupbook.examples.chapter10.Element = hogehogefugapige
  println(elem.beside(elem2).height)              //> 1
  
  elem3.beside(elem)                              //> res1: cupbook.examples.chapter10.Element = hogefugapigehoge
	println(elem3.beside(elem).height)        //> 1
	/* 小さい方に合わせる */
	
	println(elem.beside(elem).height)         //> 3
	
	val uelem = new UniformElement('*', 3, 3) //> uelem  : cupbook.examples.chapter10.UniformElement = ***
                                                  //| ***
                                                  //| ***
	println(uelem)                            //> ***
                                                  //| ***
                                                  //| ***
  val helem = new LineElement("hello")            //> helem  : cupbook.examples.chapter10.LineElement = hello
  println(helem)                                  //> hello
  
  val u2 = new UniformElement('u', 3, 3)          //> u2  : cupbook.examples.chapter10.UniformElement = uuu
                                                  //| uuu
                                                  //| uuu
  println((helem above uelem) beside u2)          //> hellouuu
                                                  //| ***  uuu
                                                  //| ***  uuu
                                                  //| ***
  
}