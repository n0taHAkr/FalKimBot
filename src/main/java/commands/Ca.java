package commands;

import net.dv8tion.jda.client.entities.Group;
import net.dv8tion.jda.core.AccountType;
import net.dv8tion.jda.core.JDA;
import net.dv8tion.jda.core.JDABuilder;
import net.dv8tion.jda.core.Permission;
import net.dv8tion.jda.core.entities.*;
import net.dv8tion.jda.core.events.message.MessageReceivedEvent;
import net.dv8tion.jda.core.exceptions.PermissionException;
import net.dv8tion.jda.core.exceptions.RateLimitedException;
import net.dv8tion.jda.core.hooks.ListenerAdapter;

import javax.security.auth.login.LoginException;
import java.util.*;

public class Ca
{
    //custom commands
    public static void pwing(String msg, MessageChannel channel)
    {
        if (msg.equals("&pwing"))
        {
            //This will send a message, "pwong!", by constructing a RestAction and "queueing" the action with the Requester.
            // By calling queue(), we send the Request to the Requester which will send it to discord.

            channel.sendMessage("pwong!").queue();
        }
    }
}