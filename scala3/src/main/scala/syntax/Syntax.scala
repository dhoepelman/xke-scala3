package syntax

// import * is now the recommended alternative to import _
// Like: Java, Kotlin, Python, Javascript, .......
import syntax._
import syntax.*

// new is now optional
// Like: Kotlin
val dogNew = new Dog("Fluffy")
val dog = Dog("Fluffy")

// All classes have generated apply() methods like case classes
class Dog(val name: String)
val dogApply = Dog.apply("1")
