package types
import scala.reflect.ClassTag

// Union types 
// Dual of intersection types

type MyEither[L, R] = L | R

// Intersection is the dual, already exists in "extends ... with ..."
type CanSerialize[T] = T & Serializable

// with is now an alias for intersection, but available because order can matter
trait Base
trait Sub extends Base with Serializable
// with is normalized to &
val sub: Base & Serializable = new Sub {}

// However, it is not as smart as e.g. Typescript by far. This will not compile.
// Typescript example: https://www.typescriptlang.org/play?#code/FAYw9gdgzgLgBAJwKZQK4BsYC44VQWwCMkE4AfOAIgEkA5AFQFEAlWgQQBkB9AZRYDUWXFswDyzSnAC8cAIzBgAM1QQQMAJaQ4KzRAA89AHwAKZGkw565KnSatOvAUJHjKASjgBvYHDjrFpigY8FKhNgws7Nx8zILMwsxiEh7evr4wABYIYADuuEh5jAjZCMYA5ACqGXBgGWVuPnAAvnBI6FBIXo2+yDCoCBCIQZgA3I1NwBPAOpCB5jBuQA
//val result: Int | "INTERNAL_SERVER_ERROR" = 1
//def process[T : ClassTag](result: T | "INTERNAL_SERVER_ERROR"): T = {
//  result match {
//    case "INTERNAL_SERVER_ERROR" => throw new Exception("Uh oh")
//    case t: T => t
//  }
//}
//
//val y: Int = process(result)