package syntax

// import * is now the recommended alternative to import _
// Like basically all other languages
import syntax._
import syntax.*

// ? is now the generic wildcard instead of _
// Like basically all other languages
val list1: List[_] = List.empty
val list2: List[?] = List()

// new is now optional
// Like: Kotlin
val dogNew = new Dog("Fluffy")
val dog = Dog("Fluffy")

// All classes have generated apply() methods like case classes
class Dog(val name: String)
val dogApply = Dog.apply("1")
