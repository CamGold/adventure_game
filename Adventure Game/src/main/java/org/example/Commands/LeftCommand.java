package org.example.Commands;

import org.example.Player.Direction;
import org.example.Player.Player;
import org.example.World.World;

public class LeftCommand {
    public LeftCommand(Player player, World world){
        switch (player.getDirection()) {
            case NORTH -> player.setDirection(Direction.WEST);
            case EAST -> player.setDirection(Direction.NORTH);
            case SOUTH -> player.setDirection(Direction.EAST);
            case WEST -> player.setDirection(Direction.SOUTH);
        }

    }
}
