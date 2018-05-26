name := "SlickMongoDBDriver"

version := "1.0"

scalaVersion := "2.12.4"

val circleVersion = "0.9.1"

libraryDependencies ++= Seq(
  "com.typesafe.slick" %% "slick" % "3.2.3",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  //TODO: check if Salat or other libraries are required
  "org.mongodb" %% "casbah" % "3.1.1",
//  "com.novus" %% "salat" % "1.9.8",
//  "com.typesafe.slick" %% "slick-testkit" % "3.0.0" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test",
  "org.scalatest" %% "scalatest" % "3.0.5" % "test",
  "io.circe" %% "circe-core" % circleVersion ,
  "io.circe" %% "circe-generic" % circleVersion,
  "io.circe" %% "circe-parser" % circleVersion,
  "io.circe" %% "circe-optics" % circleVersion
//  "org.mongodb.scala" %% "mongo-scala-driver" % "2.2.1"
)