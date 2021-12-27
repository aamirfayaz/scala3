@main def literalType: Unit = {

  val aNumber = 30

  val three: 3 = 3

  def passNumber(n: Int) = println(n)

  passNumber(aNumber)
  passNumber(three)

  def passStrict(n: 3) = println(n)

  passStrict(three)
  // passStrict(45) Type Mismatch Error

  val pi: 3.14 = 3.14
  val truth: true = true
  //val myFavLang: "Scala" = "Java" Type Mismatch Error
  val myFavLang: "Scala" = "Scala"

  //literal type to enforce compile time checks
  def doSomethingWithYourLife(meaning: Option["Study"]) = meaning.foreach(println)

  doSomethingWithYourLife(None)
  doSomethingWithYourLife(Some("Study"))
  //doSomethingWithYourLife(Some("Play")) Type Mismatch error
  println("literal types")
}