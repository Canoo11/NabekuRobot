package discot.EventHandler

import sx.blah.discord.api.events.IListener
import sx.blah.discord.handle.impl.events.MessageReceivedEvent


object MessageReceiveHandler extends IListener[MessageReceivedEvent] {
  final val watchChannel = "bot"

  def handle(event: MessageReceivedEvent) = {
    val message = event.getMessage
    val channelName = message.getChannel.getName
    val c = message.getContent

    if (channelName == "bot"){
      c match {
        case "!Bon" => message reply "fire"
        case _ =>
      }
    }
  }
}

