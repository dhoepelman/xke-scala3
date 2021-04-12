package features

object Enum extends App {
  enum Color(val name: String) {
    case Red extends Color("Red")
    case Blue extends Color("Blue")
    case Green extends Color("Green")
  }

  // List elements
  val values: Array[Color] = Color.values
  // Name to element
  val red: Color = Color.valueOf("Red")
  // Exhaustive matching
  println(red match {
    case Color.Red => "It's red!"
    case Color.Blue => "It's blue!"
    case Color.Green => "It's green!"
  })

  // They can be made a java-compatible enum
  enum JavaCompatible(val x: String) extends Enum[JavaCompatible] {
    case Member extends JavaCompatible("x")
  }
}
