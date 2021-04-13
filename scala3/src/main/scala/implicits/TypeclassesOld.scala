package implicits

object TypeclassesOld extends App {

  trait ToJson[T] {
    def toJson(t: T): String
  }

  implicit val intToJson: ToJson[Int] = new ToJson[Int] {
    override def toJson(t: Int): String = t.toString
  }

  implicit def mapJson[T](implicit toJson: ToJson[T]): ToJson[Map[String, T]] = map =>
      map
        .map( (k, v) => s""""${k}" : ${toJson.toJson(v)}""" )
        .mkString("{\n", ",\n", "\n}")

  def makeJson[T](value:T)(implicit toJson: ToJson[T]): String = toJson.toJson(value)

  println(makeJson(Map("a" -> 1, "b" -> 2)))
}

