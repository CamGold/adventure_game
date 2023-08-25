package org.example.World;

import org.example.Items.Item;
import org.example.Player.Player;
import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WorldTest {
    Player player = new Player("dummy");
    World world = new World(200, player);



    @Test
    @DisplayName("At Edge Test")
    void atEdge() {
        player.setX(200);
        assertTrue(world.atEdge());
        player.setX(-200);
        assertTrue(world.atEdge());
    }

    @Test
    @DisplayName("Player not at Edge Test")
    void notAtEdge(){
        player.setX(50);
        assertFalse(world.atEdge());
        player.setX(-50);
        assertFalse(world.atEdge());
    }

    @Test
    @DisplayName("Player is on Item test")
    void onItem() {
        for(Item item: world.getWorldObjects()){
            player.setX(item.getX());
            player.setY(item.getY());
            assertTrue(world.onItem());
        }
    }
}