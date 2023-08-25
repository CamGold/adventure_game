package org.example.Commands;

import org.example.Player.Player;
import org.example.World.World;

public class ForwardCommand {


    public ForwardCommand(String arg, Player player, World world){
        int steps = Integer.parseInt(arg);
        switch (player.getDirection()) {
            case NORTH -> player.updateX(steps);
            case EAST -> player.updateY(steps);
            case SOUTH -> player.updateX(-steps);
            case WEST -> player.updateY(-steps);
        }
        System.out.println(player.name + " moved forward by: "+steps+ " steps.");
    }
}
