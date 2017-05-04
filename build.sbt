name := "tools"

version := "2017.1.0"

enablePlugins(ScalaJSPlugin)

val scala211 = "2.11.11"

val scala212 = "2.12.2"

scalaVersion := scala211

scalacOptions ++= Seq(
  "-feature",
  "-deprecation",
  "-unchecked",
  "-language:implicitConversions"
)

//deps

libraryDependencies ++= Seq("io.scalajs" %%% "nodejs" % "0.4.0-pre2",
                            "org.scala-js" %%% "scalajs-dom" % "0.9.1")

scalaJSModuleKind := ModuleKind.CommonJSModule

// Main Class to run

mainClass in Compile := Some("sri.tools.graphqlmodels.Generator")

//bintray
resolvers += Resolver.jcenterRepo
//Test
resolvers += Resolver.bintrayRepo("scalajs-react-universe", "maven")
libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.0" % Test
//scalaJSStage in Global := FastOptStage
