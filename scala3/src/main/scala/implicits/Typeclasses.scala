package implicits

object Typeclasses extends App {

  trait ToJson[T] {
    def toJson(t: T): String
  }

  given ToJson[Int] with {
    override def toJson(t: Int): String = t.toString
  }

  given jsonMap[T] (using toJson: ToJson[T]): ToJson[Map[String, T]] with {
    override def toJson(map: Map[String, T]): String =
      map.map( (k, v) => s""""${k}" : ${toJson.toJson(v)}""" ).mkString("{\n", ",\n", "\n}")
  }

  def makeJson[T](value:T)(using toJson: ToJson[T]): String = toJson.toJson(value)

  println(makeJson(Map("a" -> 1, "b" -> 2)))
}

