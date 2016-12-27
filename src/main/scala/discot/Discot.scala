package discot

import sx.blah.discord.api._
import discot.EventHandler._

class Discot(val token: String) {
  val client = new ClientBuilder().withToken(token).login()

  println("discot instantiated")

  client.getDispatcher.registerListener(MessageReceiveHandler)
  client.getDispatcher.registerListener(MentionHandler)

}
