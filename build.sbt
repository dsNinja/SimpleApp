name := "SimpleApp"

version := "1.0"

scalaVersion := "2.11.6"

libraryDependencies ++=Seq("org.apache.spark" %% "spark-core" % "1.2.1",
  "org.apache.hadoop" % "hadoop-client" % "2.6.0"
)
