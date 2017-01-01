lazy val root = {project in file(".")}.
  settings(
    name :="NabekuRobot",
    version := "1.0",
    scalaVersion := "2.11.8"
  )

resolvers ++= Seq(
  "jitpack" at "https://jitpack.io",
  Resolver.jcenterRepo
)

libraryDependencies ++= Seq(
  "com.github.austinv11" % "Discord4j" % "2.7.0" 
)
