val scala3Version = "3.0.0-RC2"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3",
    version := "1.0.0",
    organization := "xke.scala3",
    scalaVersion := scala3Version,
    //libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.7",
    libraryDependencies += ("xke.scala3" %% "scala2library" % "1.0.0").cross(CrossVersion.for3Use2_13),
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
