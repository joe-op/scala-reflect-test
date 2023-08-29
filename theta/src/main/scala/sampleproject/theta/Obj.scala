package sampleproject.theta

import scala.reflect.Manifest
import scala.reflect.runtime.universe._

class Obj[T](name: String, c: Class[T], obj: Obj1)(implicit tag: TypeTag[T]) {
  val targs = tag.tpe match { case TypeRef(_, _, args) => args }
  println(s"type of $tag has type arguments $targs")
}
