lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "bi-oop",
      scalaVersion := "2.13.0"
    )),
    name := "hw1"
  )

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.8" % Test
