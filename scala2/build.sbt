ThisBuild / scalaVersion := "2.13.5"
ThisBuild / version := "1.0.0"
ThisBuild / organization := "xke.scala3"

lazy val root = (project in file("."))
  .settings(
    name := "scala2library",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.2",
    //libraryDependencies += ("xke.scala3" %% "scala3" % "1.0.0").cross(CrossVersion.for2_13Use3),
    scalacOptions := Seq(
      "-Xsource:2.13",
      "-unchecked",
      "-feature",
      "-deprecation",
      "-Xlint",
      "-encoding",
      "UTF8",
      "-target:jvm-1.11",
      "-Ywarn-numeric-widen",
      "-Ywarn-value-discard",
      "-Ywarn-dead-code",
      "-Ywarn-unused:implicits",
      "-Ywarn-unused:imports",
      "-Ywarn-unused:locals",
      "-Ywarn-unused:params",
      "-Ywarn-unused:patvars",
      "-Ywarn-unused:privates",
      "-language:experimental.macros",
      "-Xfatal-warnings"
    )
  )
