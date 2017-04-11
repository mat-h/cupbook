package cupbook.examples.chapter10

import ElementEncapsulated.elem

abstract class ElementEncapsulated {
  def contents: Array[String]
  def height = contents.length
  def width = contents.map(_.length).max
  override def toString = contents mkString "\n"

  def above(that: ElementEncapsulated): ElementEncapsulated = {
    val this_ = this widen that.width
    val that_ = that widen this.width
    elem(this_.contents ++ that_.contents)
  }

  def beside(that: ElementEncapsulated): ElementEncapsulated = {
    val this_ = this heighten that.height
    val that_ = that heighten this.height
    elem(
      for (
        (line1, line2) <- this_.contents zip that_.contents
      ) yield line1 + line2)
  }
  
  def widen(w: Int): ElementEncapsulated = {
    if (w <= width) this
    else {
      val left = elem(' ', (w-width)/2, height)
      val right = elem(' ', w-width-left.width, height)
      left beside this beside right
    }
  }
  
  def heighten(h: Int): ElementEncapsulated = {
    if (h <= height) this
    else {
      println(width + " " + (h-height)/2)
      val top = elem(' ', width, (h-height)/2)
      val bottom = elem(' ', width, h-height-top.height)
      top above this above bottom
    }
  }
}

object ElementEncapsulated {
  // encapsulated types
  private class ArrayElement(val contents: Array[String]) extends ElementEncapsulated
  private class LineElement(source: String) extends ArrayElement(Array(source))
  private class UniformElement(c: Char,
      override val height: Int,
      override val width: Int) extends ElementEncapsulated {
    def contents = Array.fill(height)(c.toString * width)
  }
  
  // public factories
  def elem(contents: Array[String]) : ElementEncapsulated = new ArrayElement(contents)
  def elem(source: String) : ElementEncapsulated = new LineElement(source)
  def elem(c: Char, h: Int, w: Int) : ElementEncapsulated = new UniformElement(c, h, w)
}