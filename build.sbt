name := "sbt-test"

version := "0.1"

scalaVersion := "2.12.5"

//libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "2.2.1"
libraryDependencies ++= Seq(
  "org.mongodb" %% "casbah" % "3.1.1",
  "org.slf4j" % "slf4j-simple" % "1.6.4"
)