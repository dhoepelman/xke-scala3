package types

def foo(a: String, b: String) = {}

// Eta-expanded without the _ syntax
def bar = foo // bar is (String, String) => Unit
// deprecated
def bar2 = foo _

// Implicit parameters are resolved
def impl(a: String)(implicit d: Double): Unit = {}
implicit val d: Double = 1.0

val resolved: String => Unit = impl

// But this can overwritten using query types
val unresolved: String => Double ?=> Unit = impl