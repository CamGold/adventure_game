package org.example.Commands;

import org.example.Player.Player;
import org.example.World.World;

public class ForwardCommand extends Command{
    public ForwardCommand(String arg, Player player, World world) {
        if (isNumeric(arg)) {
            int steps = Integer.parseInt(arg);
            switch (player.getDirection()) {
                case NORTH -> {
                    for(int i = 1; i<=steps; i++) {
                        player.updateX(1, true);
                    }
                }
                case EAST -> {
                    for(int i = 1; i<=steps; i++) {
                        player.updateY(1, true);
                    }
                }
                case SOUTH -> {
                    for(int i = 1; i<=steps; i++) {
                        player.updateX(-1, false);
                    }
                }
                case WEST -> {
                    for(int i = 1; i<=steps; i++) {
                        player.updateY(-1, false);
                    }
                }
            }

        } else{
            System.out.println(arg+" is not a valid number.");
        }
    }

}
