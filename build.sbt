name := "sbt-test"

version := "0.1"

scalaVersion := "2.12.5"

crossScalaVersions := Seq("2.11.12", "2.12.4")

lazy val root = (project in file(".")).enablePlugins(PlayScala)

//fix download failed: com.typesafe.sbt#sbt-native-packager;1.3.3
resolvers += Resolver.sbtPluginRepo("releases")

libraryDependencies += guice
libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "2.2.1"
libraryDependencies += "net.codingwell" %% "scala-guice" % "4.1.1"
libraryDependencies += "io.netty" % "netty-all" % "4.1.17.Final"
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test

//libraryDependencies ++= Seq(
//  "org.mongodb" %% "casbah" % "3.1.1",
//  "org.slf4j" % "slf4j-simple" % "1.6.4"
//)