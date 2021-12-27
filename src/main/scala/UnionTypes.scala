@main def unionType: Unit = {

  def example(p: Int | String | Boolean) = {

    p match {

      case _: Int     => println("Int")
      case _: Boolean => println("Boolean")
      case _: String  => println("String")
        //these matches are exhaustive, commenting anyone of them 
        //let's compiler give "match may not be exhaustive" warning
    }
  }

  example(false)
  example("12324")
  example(10)
  //example(10.0984)

  //val x: Any = if(11 > 2) "true statement" else 11
  val x: Int | String = if(11 > 20) "true statement" else 11
  example(x)

  type ErrorOr[T] = T | "error"

  def handleResource(file: ErrorOr[java.io.File]): Unit = {
    ()
  }
  handleResource(java.io.File(""))
}