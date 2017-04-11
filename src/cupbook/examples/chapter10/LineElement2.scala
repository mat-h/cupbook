package cupbook.examples.chapter10

class LineElement2(source : String) extends Element {
  val contents = Array(source)
  override def height = 1
  override def width = source.length
}