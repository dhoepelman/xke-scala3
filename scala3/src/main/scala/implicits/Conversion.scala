package implicits

case class MyString(val s: String)

val a: MyString = {
  import scala.language.implicitConversions
  given Conversion[String, MyString] with
    def apply(str: String): MyString = MyString(str)
  "a"
}

val b: MyString = {
  import scala.language.implicitConversions
  // old syntax
  implicit def stringToMyString(s: String): MyString = MyString(s)
  "b"
}
