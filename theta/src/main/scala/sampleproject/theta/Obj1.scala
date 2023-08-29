package sampleproject.theta

class Obj1 {
   protected def mkObject[T]()(implicit manifestT: Manifest[T]): Obj[T] =
    mkObject(manifestT.runtimeClass.getSimpleName)(manifestT)
  
  protected def mkObject[T](name: String)(implicit manifestT: Manifest[T]): Obj[T] = {
    val typeT = manifestT.runtimeClass.asInstanceOf[Class[T]]
    val t = new Obj[T](name, typeT, this)
    t
  }
}
