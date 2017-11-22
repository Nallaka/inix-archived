package me.nallaka.inixbot.helpcommands.funhelp;

import me.nallaka.inixbot.main.commandmeta.HelpCommand;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;

public class HelloHelpCommand implements HelpCommand {
    @Override
    public void runHelpCommand(MessageReceivedEvent event, String[] args) {
        embeddedMessageBuilder.setTitle("Hello Command")
                .setDescription("Simply Says Hello!")
                .addField("Usage", "``" + commandPrefix + "hello``", false);
        messageHandler.sendMessage(event, embeddedMessageBuilder);
        messageHandler.clearEmbeddedBuilder(embeddedMessageBuilder);
    }
}