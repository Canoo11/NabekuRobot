package nabekurobot

import sx.blah.discord.api._
import nabekurobot.EventHandler._

class NabekuRobot(val token: String) {
  val client = new ClientBuilder().withToken(token).login()

  println("NabekuRobot instantiated")

  client.getDispatcher.registerListener(MessageReceiveHandler)
  client.getDispatcher.registerListener(MentionHandler)

}
