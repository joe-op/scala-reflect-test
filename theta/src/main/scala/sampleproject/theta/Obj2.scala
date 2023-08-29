package sampleproject.theta

object Obj2 {

  val objects = new Obj1 {
    implicit val alpha = mkObject[Alpha]
    implicit val beta = mkObject[Beta]
    implicit val gamma = mkObject[Gamma]
  }
}
