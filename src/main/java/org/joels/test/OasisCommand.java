package org.joels.test;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class OasisCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (sender instanceof Player) {
            Player player = (Player) sender;

            if (args.length == 1) {
                String arg = args[0].toLowerCase();

                switch (arg) {
                    case "hello":
                        player.sendMessage("§6Welcome warrior to OasisCraft!"); // §6 es color dorado
                        break;
                    case "elfo":
                        player.sendMessage("§aLos elfos son seres mágicos con gran agilidad y conexión con la naturaleza.");
                        break;
                    case "nohumano":
                        player.sendMessage("§7Los no humanos son misteriosos y poseen habilidades desconocidas.");
                        break;
                    case "orco":
                        player.sendMessage("§2Los orcos son fuertes guerreros con una resistencia increíble.");
                        break;
                    case "humano":
                        player.sendMessage("§fLos humanos son versátiles y pueden adaptarse a cualquier entorno.");
                        break;
                    default:
                        player.sendMessage("§cComando no reconocido. Usa: /oasis hello, elfo, nohumano, orco, humano.");
                        break;
                }
                return true;
            }
        }
        return false;
    }
}
