package me.nallaka.inixbot.commands.util;

import me.nallaka.inixbot.main.commandmeta.Command;
import net.dv8tion.jda.core.entities.MessageEmbed;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class PingCommand implements Command {
    @Override
    public void runCommand(MessageReceivedEvent event, String[] args) {
        embeddedMessageBuilder.addField(new MessageEmbed.Field("Pong! -", Long.toString(event.getAuthor().getJDA().getPing()) + "ms", true));
        messageHandler.sendMessage(event, embeddedMessageBuilder);
        messageHandler.clearEmbeddedBuilder(embeddedMessageBuilder);
    }

    @Override
    public boolean executed(MessageReceivedEvent event, String[] args) {
        commandLogger.logCommand(event, args);
        return true;
    }
}