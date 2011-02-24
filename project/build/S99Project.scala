import sbt._

class S99Project(info: ProjectInfo) extends DefaultProject(info) {

  val mavenLocal = "Local Maven Repository" at "file://"+Path.userHome+"/.m2/repository"
  val scalatest = "org.scalatest" % "scalatest" % "1.3" % "test"
  val junit = "junit" % "junit" % "4.8.1"
}
