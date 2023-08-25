package org.example.Player;

import org.example.Items.Item;
import org.example.World.World;

import java.util.ArrayList;
import java.util.List;

import static org.example.Player.Direction.*;

public class Player {
    private int health = 100;
    private List<Item> inventory = new ArrayList<>();

    public Direction direction = NORTH;

    private World world;

    public String name;
    private int x = 0;
    private int y = 0;

    public Player(String name, World world){
        this.name = name;
        this.world = world;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }

    public void updateDirection(Direction direction){
        this.direction = direction;
    }

    public void updateX(int steps, boolean forward){
        int newX = this.x += steps;
        if (atEdge(newX, 0)){
            System.out.println("Player at edge");
            if (forward) {
                this.x = world.getSize();
            } else {
                this.x = (-world.getSize());
            }
        }
        else{
            this.x = newX;
        }
    }
    public void updateY(int steps, boolean forward){
        int newY = this.y += steps;
        if (atEdge(0, newY)){
            System.out.println("Player at edge");
            if (forward) {
                this.y = world.getSize();
            } else {
                this.y = (-world.getSize());
            }
        }
        else{
            this.y = newY;
        }
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }

    public void setDirection(Direction direction){
        this.direction = direction;
    }
    public Direction getDirection(){
        return this.direction;
    }


    @Override
    public String toString(){
        return this.name+"-> Health: " +this.health+", Direction: "+this.direction+", Position: ["+this.x+","+this.y+"]" ;
    }
    public boolean atEdge(int x, int y){
        if (inWorldX(world.getSize(), x) || inWorldY(world.getSize(), y)){
            return true;
        }
        return false;
    }

    public boolean inWorldX(int size, int x){
        return x >= size || x <= (-size);
    }

    public boolean inWorldY(int size, int y) {
        return y >= size || y <= (-size);
    }

    public boolean onItem(){
        boolean onItem = false;
        for(Item item : world.getWorldObjects()){
            if (x == item.getX() && y == item.getY()){
                return true;
            }
        }
        return false;
    }


}
