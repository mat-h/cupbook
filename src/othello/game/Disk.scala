package othello.game

trait Color

case class White() extends Color {}

case class Black() extends Color {}

class Disk(c : Color, _x: Int, _y:Int, turn : Int) {  
  val x = _x
  val y = _y
  
  require(x>=1 && x<=8 && y>=1 && y<=8)
}