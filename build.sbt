import sbt._
import Process._
import Keys._

name := "ml_course"

version := "0.1"

scalaVersion := "2.11.12"

libraryDependencies += "org.scalanlp" %% "breeze" % "1.0"

lazy val root =
  project.in( file(".") )


lazy val lab01 = project.in( file("lab01") )