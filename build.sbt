ThisBuild / scalaVersion := "2.13.2"

lazy val root = (project in file(".")).settings(
  scalacOptions += "-Ymacro-annotations",
  libraryDependencies ++= Seq(
    "io.circe" %% "circe-core",
    "io.circe" %% "circe-generic"
  ).map(_ % "0.12.3")
)
