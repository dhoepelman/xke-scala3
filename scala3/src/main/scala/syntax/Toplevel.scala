package syntax

// all declarations can now be top-level
// package object is now unnecessary and depcrecated

val x = 0

def foo(): Unit = {}
def bar(): Unit = {}

case class Product(category: String)
val products = Seq(Product("Fruit"))

trait Animal

def either(): Either[Int, String] = Left(0)