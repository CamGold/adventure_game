package org.example.World;

import org.example.Items.Food;
import org.example.Items.Item;
import org.example.Items.Misc;
import org.example.Items.Weapon;
import org.example.Player.Inventory;
import org.example.Player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class World {

    private int worldSize;
    private Player player;
    List<Item> worldObjects = new ArrayList<>();

    public World(int size){
        this.worldSize = size;
        setWorldObjects();
    }

    private void setWorldObjects(){
        this.worldObjects.add(new Food(20, 30, "Bread", 20));
        this.worldObjects.add(new Weapon(10, 50, "Sword", 10));
        this.worldObjects.add(new Misc(15, 60, "Mug", 15));
    }

    public List<Item> getWorldObjects(){
        return this.worldObjects;
    }

    public int getSize(){
        return this.worldSize;
    }



}
