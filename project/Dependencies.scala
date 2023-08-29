import sbt._

object Dependencies {

  val buildScalaVersion = "2.12.18"

  val scalaReflectVersion = buildScalaVersion

  lazy val scalaReflect = "org.scala-lang" % "scala-reflect" % scalaReflectVersion

}
