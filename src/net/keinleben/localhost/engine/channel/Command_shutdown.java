package net.keinleben.localhost.engine.channel;

import net.keinleben.localhost.engine.source.Source;
import net.keinleben.localhost.engine.system.System;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * [- Author: Felix / Froznshard -]
 */
public class Command_shutdown
        implements CommandExecutor, Source {

    System sys = new System();

    @Override
    public boolean onCommand(CommandSender commandSender, Command command,
                             String s, String[] strings) {
        switch (command.getName()) {
            case "shutdown":
                commandSender.sendMessage(engine + "Engine is shutting down.");
                sys.shuttingDown();
                return true;
            case "info":
                if (commandSender instanceof Player)
                    sys.compactInfo((Player) commandSender);
                return true;
        }
        return false;
    }
}
