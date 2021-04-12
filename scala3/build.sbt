val scala3Version = "3.0.0-RC2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3",
    version := "1.0.0",

    scalaVersion := scala3Version,

    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7",

    scalacOptions := Seq(
      "-unchecked",
      "-feature",
      "-deprecation",
      "-encoding",
      "UTF8",
      "-Xfatal-warnings",
      "-Yexplicit-nulls"
    )
  )
