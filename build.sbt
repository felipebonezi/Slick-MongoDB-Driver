name := "SlickMongoDBDriver"

version := "1.0"

scalaVersion := "2.12.6"

fork in Test := true
javaOptions ++= Seq("-Xms512M", "-Xmx2048M", "-XX:+CMSClassUnloadingEnabled")
libraryDependencies ++= Seq(
  "org.scala-lang" % "scala-reflect" % scalaVersion.value,
  "com.typesafe.slick" %% "slick" % "3.2.3",
  "org.mongodb" %% "casbah" % "3.1.1",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  "org.slf4j" % "slf4j-nop" % "1.7.7"
)
