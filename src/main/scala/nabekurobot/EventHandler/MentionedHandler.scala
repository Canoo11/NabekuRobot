package nabekurobot.EventHandler

import sx.blah.discord.api.events.IListener
import sx.blah.discord.handle.impl.events.MentionEvent
import sx.blah.discord.handle.obj.IMessage


object MentionHandler extends IListener[MentionEvent] {
  def handle(event: MentionEvent) = {
    val message = event.getMessage
    val c = message.getContent.split(" ")(1)

    c match{
      case bonfire if c.equals("!bon") => message.reply("fire")
      case _ => 
    }
  }
}
