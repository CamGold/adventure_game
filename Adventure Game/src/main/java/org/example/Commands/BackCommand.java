package org.example.Commands;

import org.example.Player.Player;
import org.example.World.World;

public class BackCommand extends Command{
    public BackCommand(String arg, Player player, World world) {
        if (isNumeric(arg)) {
            int steps = Integer.parseInt(arg);
            switch (player.getDirection()) {
                case NORTH -> player.updateX(-steps, false);
                case EAST -> player.updateY(-steps, false);
                case SOUTH -> player.updateX(steps, true);
                case WEST -> player.updateY(steps,true);
            }

        } else {
            System.out.println(arg + " is not a valid number.");
        }
    }
}
