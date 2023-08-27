package org.example.Commands;

import org.example.Player.Direction;
import org.example.Player.Player;
import org.example.World.World;

public class RightCommand {

    public RightCommand(Player player, World world){
        switch (player.getDirection()) {
            case NORTH -> player.setDirection(Direction.EAST);
            case EAST -> player.setDirection(Direction.SOUTH);
            case SOUTH -> player.setDirection(Direction.WEST);
            case WEST -> player.setDirection(Direction.NORTH);
        }

    }
}
