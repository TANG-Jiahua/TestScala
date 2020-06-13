object WhatsWrong1 extends App{

  trait Interface {
    val city: String
    def support: String = s"Ici c'est $city !"
  }

  case object Supporter extends Interface {

    override val city = "Paris"
  }

  println(Supporter.city) //What does this print ?  Paris
  println(Supporter.support) //What does this print and why ? How to fix it ?
                             // Ici c'est null. Because the supporter give value after support. To fix it I change val support to def
}
