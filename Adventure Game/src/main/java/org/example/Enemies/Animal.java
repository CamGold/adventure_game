package org.example.Enemies;



public class Animal implements Enemy {

    private String name = "";
    private final EnemyType type = EnemyType.Animal;
    private int x = 0;
    private int y = 0;
    private int health = 0;
    private int damage = 0;

    public Animal(int x, int y, String name, int health, int damage){
        this.x = x;
        this.y = y;
        this.name = name;
        this.health = health;
        this.damage = damage;
    }
    @Override
    public EnemyType getType() {
        return this.type;
    }

    @Override
    public void setX(int x) {
        this.x = x;
    }

    @Override
    public void setY(int y) {
        this.y = y;
    }

    @Override
    public void updateHealth(int damage) {
        this.health -= damage;
    }

    @Override
    public String getName() {
        return this.name;
    }


    @Override
    public int getDamage() {
        return this.damage;
    }

    @Override
    public int getHealth() {
        return this.health;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public String toString(){
        return this.name + ", Health:" + this.health;
    }
}
