package cupbook.examples.chapter3

import scala.collection.mutable
import scala.collection.immutable.HashSet

object Sets {
  var jetSet = Set("Boeing", "Airbus")
  var jetSet2 = Set("Boeing", "Airbus", "Boeing")
  
  jetSet += "Lear"
  println(jetSet)
  
  var movieSet = mutable.Set("Hitch", "Poltergeist")
  movieSet += "Shrek"
  println(movieSet)
  
  jetSet.getClass
  
  movieSet.getClass
  
  // typeOf[Set] // refrection. "org.scala-lang" % "scala-reflect" % "2.10.0"
  // typeOf[mutalbe.Set]
  
  val hotpepper = HashSet("Tomatoes", "Chilies")
 	println(hotpepper + "Coriander")

 	
 	val treasureMap = mutable.Map[Int, String]()
 	treasureMap += (1 -> "Go to Island")
 	treasureMap += (2 -> "Find big X on ground")
 	treasureMap += (3 -> "Dig")
 	println(treasureMap)
 	println(treasureMap(2))
 	
 	treasureMap.getClass
 	
 	val romanNumeral = Map(
 		1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
 	)
  println(romanNumeral(4))
  
  var mutableRomanNumeral = romanNumeral + (6 -> "VI") // new immutable.Map
}