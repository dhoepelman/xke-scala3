package implicitsold

// Extension functions
trait Animal
case class Dog(name: String) extends Animal

extension (doggo: Dog) def bark1(): Unit = println("woof")
extension [T <: Animal](animal: T) def walk(): Unit = println("walk")

// Old syntax:
implicit class DogExtensions(val doggo: Dog) extends AnyVal {
  def bark2(): Unit = println("woof")
}

val woof1 = Dog("1").bark1()
val woof2 = Dog("2").bark2()
val woof3 = Dog("3").walk()