/**
  * Tell developer names by the department code
  * Expected result:
  * Map(frontend -> List(Remy, Alexandre), analytics -> List(Pierre), api -> List(Noe))
  */
object MapYourMap extends App{

  val devNames = Map("dev1" -> "Pierre", "dev2" -> "Remy", "dev3" -> "Noe", "dev4" -> "Alexandre")
  val devDepartments = Map("dev1" -> "analytics", "dev2" -> "frontend", "dev3" -> "api", "dev4" -> "frontend")

  val namesInDepartments:Map[String, List[String]] ={
    var map:Map[String,List[String]] = Map()
    val keyDep = devDepartments.keys
    val dep_iter = keyDep.iterator

    while (dep_iter.hasNext){
     
      val keyD = dep_iter.next()
      var list : List[String] = List(devNames.get(keyD).get)
      if (map.contains(devDepartments.get(keyD).get)){
        println(devNames.get(keyD).get)
        var tmp : List[String] = map.get(devDepartments.get(keyD).get).get
        tmp = tmp :+ devNames(keyD)
        list=tmp
      }
      map += devDepartments(keyD)->list

    }
    map
  }
}
