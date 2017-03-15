name := "scala_sample"
version := "1.0"
scalaVersion := "2.12.1"

val http4sVersion = "0.15.6"
val scalatestVersion = "3.0.1"

val mainServerClass = "server.MainServer"


libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-simple" % "1.6.4",

  "org.scalactic" %% "scalactic" % scalatestVersion,
  "org.scalatest" %% "scalatest" % scalatestVersion % "test",

//  "io.argonaut" %% "argonaut" % "6.1",
  "org.http4s" %% "http4s-dsl" % http4sVersion,
  "org.http4s" %% "http4s-argonaut" % http4sVersion,
  "org.http4s" %% "http4s-blaze-server" % http4sVersion,
  "org.http4s" %% "http4s-blaze-client" % http4sVersion
)

mainClass in (Compile, packageBin) := Some(mainServerClass)

mainClass in (Compile, run) := Some(mainServerClass)