package nabekurobot

import sx.blah.discord.util._

object Startup extends App{
  val token = io.Source.fromFile("Token").mkString.stripLineEnd

  try{
   new NabekuRobot(token)
  }catch{
   case e:DiscordException => println("Bad token")
   case e:Exception => println("Something happen")
  }
}
