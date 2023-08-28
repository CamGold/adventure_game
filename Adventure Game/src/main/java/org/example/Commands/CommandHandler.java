package org.example.Commands;

import org.example.Player.Player;
import org.example.World.World;

import java.io.FileNotFoundException;

public class CommandHandler {

    public void handleCommand(String command, Player player, World world) throws FileNotFoundException {
        String[] args = command.toLowerCase().split(" ");
        switch (args[0]) {
            case "forward"-> {
                System.out.println(player.name + " moved forward by: " + args[1] + " steps.");
                new ForwardCommand(args[1], player, world);
            }
            case "back" -> {
                System.out.println(player.name + " moved backward by: " + args[1] + " steps.");
                new BackCommand(args[1], player, world);
            }
            case "right" -> {
                System.out.println(player.name+ " turned right.");
                new RightCommand(player, world);
            }
            case "left" -> {
                System.out.println(player.name +" turned left.");
                new LeftCommand(player, world);
            }
            case "inv" -> new InventoryCommand(player, world);
            case "quit" -> new QuitCommand();
            case "help" -> new HelpCommand();
            default -> new InvalidCommand(command);
        }
    }


}
