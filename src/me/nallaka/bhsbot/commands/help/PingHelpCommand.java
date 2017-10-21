package me.nallaka.bhsbot.commands.help;

import me.nallaka.bhsbot.main.Command;
import net.dv8tion.jda.core.EmbedBuilder;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

import java.awt.*;

public class PingHelpCommand implements Command {
    @Override
    public boolean called(MessageReceivedEvent event, String[] args) {
        return false;
    }

    @Override
    public void runCommand(MessageReceivedEvent event, String[] args) {
        embeddedMessageBuilder.setTitle("Ping Command")
                .setDescription("Returns Your Ping")
                .addField("Usage", "``.ping``", true);
        event.getTextChannel().sendMessage(embeddedMessageBuilder.build()).queue();
        messageHandler.clearEmbeddedBuilder(embeddedMessageBuilder);
    }

    @Override
    public void executed(MessageReceivedEvent event, String[] args) {
        commandLogger.logCommand(event, args);
    }
}
