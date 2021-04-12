package types


type IsJavaCollection[X <: (java.util.Collection[?] | scala.collection.Iterable[?])] = X match {
  case java.util.Collection[?] => true
  case scala.collection.Iterable[?] => false
}
