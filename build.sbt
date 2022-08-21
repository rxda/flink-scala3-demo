name := "flink-scala-3"

version := "0.1"

scalaVersion := "3.1.3"

resolvers += Resolver.mavenLocal

javacOptions ++= Seq("-source", "11", "-target", "11")

libraryDependencies += "org.apache.flink" % "flink-streaming-java" % "1.15.1" % "provided"
// https://mvnrepository.com/artifact/org.apache.flink/flink-clients
libraryDependencies += "org.apache.flink" % "flink-clients" % "1.15.1"
// https://mvnrepository.com/artifact/org.apache.flink/flink-table-planner-loader
libraryDependencies += "org.apache.flink" % "flink-table-planner-loader" % "1.15.1"
// https://mvnrepository.com/artifact/io.findify/flink-scala-api
libraryDependencies += "io.findify" %% "flink-scala-api" % "1.15-2"
// https://mvnrepository.com/artifact/org.scala-lang/scala3-library
//libraryDependencies += "org.scala-lang" %% "scala3-library" % "3.1.3"
libraryDependencies += "io.findify" %% "flink-adt" % "0.6.1"
