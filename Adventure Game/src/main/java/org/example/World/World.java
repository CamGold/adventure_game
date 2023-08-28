package org.example.World;

import org.example.Enemies.Animal;
import org.example.Enemies.Enemy;
import org.example.Enemies.Human;
import org.example.Enemies.Undead;
import org.example.Items.*;
import org.example.Player.Inventory;
import org.example.Player.Player;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class World {

    private int worldSize;
    private Player player;
    List<Item> worldObjects = new ArrayList<>();
    List<Enemy> worldEnemies = new ArrayList<>();

    public World(int size){
        this.worldSize = size;
        setWorldObjects();
        setWorldEnemies();
    }

    private void setWorldObjects(){
        this.worldObjects.add(new Food(20, 30, "Bread", 20));
        this.worldObjects.add(new Weapon(10, 50, "Sword", 10));
        this.worldObjects.add(new Misc(15, 60, "Mug", 15));
        this.worldObjects.add(new Armor(10, 20, "Dwarven Armor", 50));
    }

    private void setWorldEnemies(){
        this.worldEnemies.add(new Animal(25, 15, "Wolf", 20, 10));
        this.worldEnemies.add(new Human(55, 80, "Bandit", 80, 20));
        this.worldEnemies.add(new Undead(45, 100, "Skeleton", 10, 30));
    }


    public List<Item> getWorldObjects(){
        return this.worldObjects;
    }
    public  List<Enemy> getWorldEnemies(){
        return this.worldEnemies;
    }

    public int getSize(){
        return this.worldSize;
    }



}
