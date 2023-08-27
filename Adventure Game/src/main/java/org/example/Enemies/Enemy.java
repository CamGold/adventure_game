package org.example.Enemies;

public interface Enemy {

    EnemyType getType();

    void setX(int x);
    void setY(int y);
    void updateHealth(int damage);
    String getName();
    int getDamage();
    int getHealth();
    int getX();
    int getY();
}
