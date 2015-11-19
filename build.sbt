name := "scalawork"

version := "1.0"

scalaVersion := "2.11.7"

resolvers += "Underscore Training" at "https://dl.bintray.com/underscoreio/training"

libraryDependencies += "org.scalatest" % "scalatest_2.11" % "2.2.4" % "test"

enablePlugins(JettyPlugin)

libraryDependencies += "javax.servlet" % "javax.servlet-api" % "3.1.0"

libraryDependencies += "org.scala-lang.modules" % "scala-xml_2.11" % "1.0.5"

libraryDependencies += "underscoreio" %% "doodle" % "0.1.0"

