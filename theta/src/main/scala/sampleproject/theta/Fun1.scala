package sampleproject.theta

object Fun1 {

  def run[T1](t1: Obj[T1]) {
    println("overload one");
  }

  def run[T1, T2](t1: Obj[T1], t2: Obj[T2]) {
    println("overload two");
  }

}
