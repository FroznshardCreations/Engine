package net.keinleben.localhost.engine.channel;

import net.keinleben.localhost.engine.system.System;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;

/**
 * [- Author: Felix / Froznshard -]
 */
public class Command_shutdown
        implements CommandExecutor {

    System sys = new System();

    @Override
    public boolean onCommand(CommandSender commandSender, Command command,
                             String s, String[] strings) {
        switch (command.getName()){
            case "shutdown":
                commandSender.sendMessage("Engine is shutting down.");
                sys.shuttingDown();
                return true;
        }
        return false;
    }
}
