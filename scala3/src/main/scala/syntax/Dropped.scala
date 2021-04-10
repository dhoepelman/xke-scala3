package syntax

// Auto application
val autoApplication = {
  def foo(): Unit = {}
  
  //foo
  foo()
  
  // Still allowed for Java methods
  java.lang.Object().toString
  java.lang.Object().toString()
}

// Symbol literals
val symbols = {
  import language.deprecated.symbolLiterals
  Seq('foo)
  Seq(Symbol("foo"))
}

// Do-while
val doWhile = {
  //  do {
  //    println("Hello!")
  //  } while (true)

  while({ println("Hello!"); true }) ()
}
