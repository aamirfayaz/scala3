@main def unionType: Unit = {

  def example(p: Int | String | Boolean) = {
    p match {

      case _: Int     => println("Int")
      case _: Boolean => println("Boolean")
      case _: String  => println("String")
    }
  }

  example(false)
  example("12324")
  example(10)
  //example(10.0984)

  //val x: Any = if(11 > 2) "true statement" else 11
  val x: Int | String = if(11 > 20) "true statement" else 11
  example(x)
}