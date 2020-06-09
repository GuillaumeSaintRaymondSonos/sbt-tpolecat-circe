package example

import java.time.Instant
import io.circe.generic.JsonCodec
import io.circe.syntax._

object Hello extends App {
  println(Greeting("hello").asJson.noSpaces)
}

@JsonCodec
case class Greeting(value: String)
