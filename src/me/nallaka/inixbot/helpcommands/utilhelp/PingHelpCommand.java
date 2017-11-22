package me.nallaka.inixbot.helpcommands.utilhelp;

import me.nallaka.inixbot.main.commandmeta.HelpCommand;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class PingHelpCommand implements HelpCommand {
    @Override
    public void runHelpCommand(MessageReceivedEvent event, String[] args) {
        embeddedMessageBuilder.setTitle("Ping")
                .setDescription("Returns Latency")
                .addField("Usage", "``" + commandPrefix + "ping``", false);
        messageHandler.sendMessage(event, embeddedMessageBuilder)
                .clearEmbeddedBuilder(embeddedMessageBuilder);
    }
}