package cupbook.examples.chapter10

import ElementEncapsulated.elem

object spiral {
  println("Enjoy Spirals...")                     //> Enjoy Spirals...
  
  val space = elem(" ")                           //> space  : cupbook.examples.chapter10.ElementEncapsulated =  
  val corner = elem("+")                          //> corner  : cupbook.examples.chapter10.ElementEncapsulated = +
  
  def spiral(nEdges: Int, direction: Int): ElementEncapsulated = {
  	if (nEdges == 1) corner
  	else {
  		val SPIRAL = spiral(nEdges-1, (direction+3)%4)
  		val vBar = elem('|', 1, SPIRAL.height)
  		val hBar = elem('-', SPIRAL.width, 1)
  		
  		direction match {
  			case 0 => (corner beside hBar) above (SPIRAL beside space)
  			case 1 => (SPIRAL above space) beside (corner above vBar)
  			case 2 => (space beside SPIRAL) above (hBar beside corner)
  			case _ => (vBar above corner) beside (space above SPIRAL)
  		}
  	}
  }                                               //> spiral: (nEdges: Int, direction: Int)cupbook.examples.chapter10.ElementEncap
                                                  //| sulated
  
  println(elem(Array("+-+", "| |", "+  ")))       //> +-+
                                                  //| | |
                                                  //| +  
  println(elem("+") above elem(" "))              //> +
                                                  //|  
  println(elem(" ") above elem("+"))              //>  
                                                  //| +
  println(elem("+") above elem(" +"))             //> 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
                                                  //| 1 0
  println(elem(" +") above elem("+"))
  println(elem("+") beside elem(" +"))
  
  println((elem(" ") beside elem(Array("+-", "+ "))))
  
  println((elem(" ") beside elem(Array("+-", "+ "))) above (elem("--") beside elem("+")))
  // println(spiral(1,0))
  // println(spiral(2,0))
  // println(spiral(3,0))
  
  // println(spiral(4,0))
  // println(spiral(5,0))
  // println(spiral(6,0))
}