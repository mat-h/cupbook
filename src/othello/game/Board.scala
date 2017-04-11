package othello.game

object Board {
  var disks : Seq[Disk] = Seq()
  var turn : Int = 0
  
  def putB(x: Int, y: Int) {
    disks = disks :+ new Disk(Black(), x, y, turn)
    turn += 1
  }
  
  override def toString() : String = {
    var base = 
    "+---------------+\n" +
    "| | | | | | | | |\n" +
    "+---------------+\n" +
    "| | | | | | | | |\n" +
    "+---------------+\n" +
    "| | | | | | | | |\n" +
    "+---------------+\n" +
    "| | | | | | | | |\n" +
    "+---------------+\n" +
    "| | | | | | | | |\n" +
    "+---------------+\n" +
    "| | | | | | | | |\n" +
    "+---------------+\n" +
    "| | | | | | | | |\n" +
    "+---------------+\n" +
    "| | | | | | | | |\n" +
    "+---------------+\n"
    disks.foreach(d => { base = base.updated(basePosition(d), 'o') })
    
    base
  }
  
  def basePosition(d: Disk) = d.x * 2 - 1 + d.y * 18 * 2 - 18
}