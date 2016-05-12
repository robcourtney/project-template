import com.typesafe.sbt.SbtNativePackager.autoImport._

name := "MyApp"

version := "1.0"

scalaVersion := "2.11.7"

val akkaVersion = "2.4.4"

val akkaStreamsVersion = "2.0.4"

libraryDependencies ++= Seq(
  "ch.qos.logback"      %  "logback-classic"      % "1.1.1" force,
  "com.typesafe.scala-logging" %% "scala-logging-slf4j"   % "2.1.2",
  // "com.typesafe.akka"   %% "akka-actor"           % akkaVersion withSources(),
  // "com.typesafe.akka"   %% "akka-camel"           % akkaVersion withSources(),
  // "com.typesafe.akka"   %% "akka-cluster"         % akkaVersion withSources(),
  // "com.typesafe.akka"   %% "akka-kernel"          % akkaVersion withSources(),
  // "com.typesafe.akka"   %% "akka-slf4j"           % akkaVersion,
  // "com.typesafe.akka"   %% "akka-testkit"         % akkaVersion withSources(),
  "com.typesafe.akka"   %% "akka-actor"                           % akkaVersion,
  "com.typesafe.akka"   %% "akka-stream-experimental"             % akkaStreamsVersion,
  "com.typesafe.akka"   %% "akka-http-core-experimental"          % akkaStreamsVersion,
  // "com.typesafe.akka"   %% "akka-http-scala-experimental"         % "1.0-RC2",
  // "com.typesafe.akka"   %% "akka-http-spray-json-experimental"    % "1.0-RC2",
  // "com.typesafe.akka"   %% "akka-http-testkit-scala-experimental" % "1.0-RC2",
  "commons-codec"       %  "commons-codec"        % "1.9",
  "commons-dbcp"        %  "commons-dbcp"         % "1.4",
  // "org.apache.camel"    %  "camel-jms"            % V.Camel withSources(),
  // "org.apache.camel"    %  "camel-jetty"          % V.Camel withSources(),
  // "org.apache.camel"    %  "camel-ftp"            % V.Camel withSources(),
  // "org.apache.camel"    %  "camel-test"           % V.Camel withSources(),
  "org.codehaus.janino" % "janino"                % "2.6.1"
  // "org.scalatest"     %% "scalatest"                            % scalaTestV % "test",
)

enablePlugins(JavaServerAppPackaging)

mainClass in Compile := Some("HelloWorld")


// SBT Assembly options
assemblyJarName in assembly := "HelloWorld.jar"

test in assembly := {}

mainClass in Compile := Some("HelloWorld")