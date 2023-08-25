package org.example.Commands;

import org.example.Player.Player;
import org.example.World.World;

public class ForwardCommand extends Command{
    public ForwardCommand(String arg, Player player, World world) {
        if (isNumeric(arg)) {
            int steps = Integer.parseInt(arg);
            switch (player.getDirection()) {
                case NORTH -> player.updateX(steps, true);
                case EAST -> player.updateY(steps, true);
                case SOUTH -> player.updateX(-steps, false);
                case WEST -> player.updateY(-steps, false);
            }
            System.out.println(player.name + " moved forward by: " + steps + " steps.");
        } else{
            System.out.println(arg+" is not a valid number.");
        }
    }

}
