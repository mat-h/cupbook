package cupbook.examples.chapter10

class UniformElement(
    c: Char, 
    override val height: Int, 
    override val width: Int
) extends Element  {
  val s = c.toString * width
  def contents = Array.fill(height)(s)
}