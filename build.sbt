import sbt._
import Process._
import Keys._


lazy val root =
  project.in( file(".") ).settings(name := "ml_course", version := "0.1", scalaVersion := "2.11.12")


lazy val lab01 = project.in( file("lab01")).settings(name:="lin_reg", version:="0.1", scalaVersion := "2.11.12", libraryDependencies+= "org.scalanlp" %% "breeze" % "1.0")