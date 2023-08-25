package org.example.Commands;

import org.example.Player.Player;
import org.example.World.World;

public class CommandHandler {

    public void handleCommand(String command, Player player, World world){
        String[] args = command.toLowerCase().split(" ");
        switch (args[0]) {
            case "forward"-> new ForwardCommand(args[1], player, world);
            case "back" -> new BackCommand(args[1], player, world);
            case "right" -> new RightCommand(player, world);
            case "left" -> new LeftCommand(player, world);
            default -> new InvalidCommand(command);
        }
    }


}
