# sbt-tpolecat-circe

Sample project for issue https://github.com/DavidGregory084/sbt-tpolecat/issues/22

There's an unsed import in file src/main/scala/example/Hello.scala.
It's reported in Scala 2.13.1 but not in Scala 2.13.2.
It seems also that the scalac options `-Ymacro-annotations` conflicts with this behaviour.
