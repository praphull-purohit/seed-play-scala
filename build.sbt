val commonSettings = Seq(
  organization := "com.praphull",
  scalaVersion := "2.13.4",
  libraryDependencies ++= Seq(guice),

  //Do not generate docs while creating dist
  Compile / doc / sources := Nil,
  Compile / packageDoc / publishArtifact := false
)

lazy val root = (project in file("."))
  .enablePlugins(PlayScala)
  .settings(commonSettings)
  .settings(
    name := """Play Scala Seed""",
    version := "1.0-SNAPSHOT",
    libraryDependencies ++= Seq(
      "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test,

      //DB
      "com.typesafe.slick" %% "slick" % "3.3.3",
      //"org.slf4j" % "slf4j-nop" % "1.6.4",
      "com.typesafe.slick" %% "slick-hikaricp" % "3.3.3",
      "org.postgresql" % "postgresql" % "42.2.19"
    )

  )