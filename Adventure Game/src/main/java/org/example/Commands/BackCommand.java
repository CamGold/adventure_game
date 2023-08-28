package org.example.Commands;

import org.example.Player.Player;
import org.example.World.World;

public class BackCommand extends Command{
    public BackCommand(String arg, Player player, World world) {
        if (isNumeric(arg)) {
            int steps = Integer.parseInt(arg);
            switch (player.getDirection()) {
                case NORTH -> {
                    for(int i = 1; i<=steps; i++) {
                        player.updateX(-1, false);
                    }
                }
                case EAST -> {
                    for(int i = 1; i<=steps; i++) {
                        player.updateY(-1, false);
                    }
                }
                case SOUTH -> {
                    for(int i = 1; i<=steps; i++) {
                        player.updateX(1, true);
                    }
                }
                case WEST -> {
                    for(int i = 1; i<=steps; i++) {
                        player.updateY(1, true);
                    }
                }
            }

        } else {
            System.out.println(arg + " is not a valid number.");
        }
    }
}
