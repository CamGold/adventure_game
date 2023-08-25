package org.example.Player;

import org.example.Items.Item;

import java.util.ArrayList;
import java.util.List;

import static org.example.Player.Direction.*;

public class Player {
    private int health = 100;
    private List<Item> inventory = new ArrayList<>();

    public Direction direction = NORTH;

    public String name;
    private int x = 0;
    private int y = 0;

    public Player(String name){
        this.name = name;
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

    public void updateX(int steps){
        this.x += steps;
    }
    public void updateY(int steps){
        this.y+= steps;
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



}
