package cupbook.examples.chapter10

abstract class Element {
  def contents: Array[String]
  def height = contents.length
  def width = contents.map(_.length).max
  override def toString = contents mkString "\n"

  def above(that: Element): Element = {
    new ArrayElement(this.contents ++ that.contents)
  }

  def beside(that: Element): Element = {
    new ArrayElement(
      for (
        (line1, line2) <- this.contents zip that.contents
      ) yield line1 + line2)
  }
}