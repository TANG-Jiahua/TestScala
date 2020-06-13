/**
  * This is basic language questions so don't use external library or build in function
  */
object BasicScala extends App {


  /**
    * Encode parameter in url format
    *
    * Example:
    *
    * input  : Map("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
    * output : "?sort_by=name&order_by=asc&user_id=12"
    *
    * input  : Map()
    * output : ""
    */
  def encodeParamsInUrl(params: Map[String, String]): String = {
    var output = "?"
    val keyset = params.keys
    val key_iter = keyset.iterator
    while (key_iter.hasNext){
      val key = key_iter.next()
      output+=key+"="+params.get(key).get+"&"
    }
    output.dropRight(1)

  }


  /**
    * Test if a String is an email
    */
  def isEmail(maybeEmail: String) : Boolean= {
    var email = "[a-zA-Z0-9_-]+@[a-zA-Z0-9_-]+.[a-zA-Z0-9_-]".r
    getResult(email.findFirstIn(maybeEmail))
  }

  def getResult(result: Option[String]) :Boolean={
    if (result == None){
      false
    }else{
      true
    }
  }


  /**
    * Compute i ^ n
    *
    * Example:
    *
    * input : (i = 2, n = 3) we compute 2^3 = 2x2x2
    * output : 8
    *
    * input : (i = 99, n = 38997)
    * output : 1723793299
    */
  def power(i:Int, n:Int):Int = {
    var res = 1
    for (_<-1 to n)
      res=multi(res,i)
    res
  }

  def multi(i:Int, n:Int):Int={
    i*n
  }


  var map = Map[String,String]("sort_by" -> "name", "order_by" -> "asc", "user_id" -> "12")
  println(encodeParamsInUrl(map))
  println(isEmail("tang.tang@164.com"))
  println(power(2,3))
}
