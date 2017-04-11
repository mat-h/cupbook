package cupbook.examples.chapter4

import scala.collection.mutable

class ChecksumAccumulator {
  private var sum = 0
  def add(b: Byte) : Unit = sum += b
  def checksum() = ~(sum & 0xFF) + 1
}

object ChecksumAccumulator { // <- scalaの自動生成するシングルトン。new ChecksumAccumulator$のインスタンス
  private var cache = mutable.Map.empty[String, Int]
  
  def calc(s: String) : Int = {
    if (cache.contains(s)) cache(s)
    else {
      val acc = new ChecksumAccumulator // <- ChecksumAccumulatorのインスタンス
      for (c <- s) 
        acc.add(c.toByte)
      val cs = acc.checksum()
      cache += (s -> cs)
      cs
    }
  }
}