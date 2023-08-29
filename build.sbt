import Dependencies._

ThisBuild / organization := "sampleproject"
ThisBuild / version      := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := buildScalaVersion

lazy val lib = Seq(
      scalaReflect,
    )

lazy val root = (project in file("."))
  .aggregate(theta)
  .settings(
    libraryDependencies ++= lib
  )

lazy val theta = project
  .settings(
    libraryDependencies ++= lib
  )
