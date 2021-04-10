package syntax

object Whitespace extends App {
  // Braces and brackets are always optional

  // Scala 2 & 3
  for {
    p <- products
    if p.category == "Fruit"
  } yield p

  // Scala 3
  for
    p <- products
    if p.category == "Fruit"
  yield p

  // Scala 2 & 3
  if(x < 0) {
    foo()
  } else {
    bar()
  }

  // Scala 3
  if x < 0 then
    foo()
  else
    bar()

  class BracesDog(name: String) extends Animal {
    val coatColor = "Brown"
    def bark()    = println("Woof")
  }

  class WhitespaceDog(name: String) extends Animal:
    val coatColor = "Brown"
    def bark()    = println("Woof")
  
  val bracesMatch = either() match {
    case Left(x)   => true
    case Right(x)  => false
  }
  
  val whitespaceMatch = either() match
    case Left(x)  => true
    case Right(x) => false
}



