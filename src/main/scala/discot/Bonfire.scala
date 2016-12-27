package discot

import sx.blah.discord.util._

object Bonfire extends App{
  val token = io.Source.fromFile("Token").mkString.stripLineEnd

  try{
   new Discot(token)
  }catch{
   case e:DiscordException => println("Bad token")
   case e:Exception => println("Something happen")
  }
}
