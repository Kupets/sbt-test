name := "sbt-test"

version := "0.1"

scalaVersion := "2.12.5"

crossScalaVersions := Seq("2.11.12", "2.12.4")

//play scala plugin
lazy val root = (project in file(".")).enablePlugins(PlayScala)

//fix download failed: com.typesafe.sbt#sbt-native-packager;1.3.3
resolvers += Resolver.sbtPluginRepo("releases")

//lightweight dependency injection framework for Java 6 and above, brought to you by Google
libraryDependencies += guice
//mongo-scala-driver
libraryDependencies += "org.mongodb.scala" %% "mongo-scala-driver" % "2.2.1"
//lightweight dependency injection framework for Java 6 and above, brought to you by Google
libraryDependencies += "net.codingwell" %% "scala-guice" % "4.1.1"
//cloud.mongodb.com ssl support
libraryDependencies += "io.netty" % "netty-all" % "4.1.17.Final"
//play framework
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "3.1.2" % Test