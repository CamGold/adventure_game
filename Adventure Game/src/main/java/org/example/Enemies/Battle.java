package org.example.Enemies;

import org.example.Player.Player;

import java.util.Random;
import java.util.Scanner;

public class Battle {

    private final Player player;
    private final Enemy enemy;

    public Battle(Player player, Enemy enemy){
        this.player = player;
        this.enemy = enemy;
    }

    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("You have come across a " + enemy.getName());
        while(player.getHealth() > 0 && enemy.getHealth()>0){
            int enemyHitChance = enemyHit();
            System.out.println("Attack or Block?");
            String action = scanner.nextLine().toLowerCase();
            switch (action){
                case "attack" -> {
                    enemy.updateHealth(player.getDamage());
                    System.out.println("You have attacked the "+enemy.getName());
                }
                case "block" -> {
                    System.out.println("You have blocked the attack.");
                    enemyHitChance = 0;
                }
            }
            switch (enemyHitChance) {
                case 1 -> {
                    System.out.println("The enemy hit you");
                    player.updateHealth(-enemy.getDamage());
                    System.out.println("Your health is now "+player.getHealth());
                }
                case 2 -> System.out.println("The enemy missed it's attack!");
            }
            if(enemy.getHealth() <= 0){
                System.out.println("You have slain the " +enemy.getName());
            }else{
                System.out.println(enemy);
            }
        }

    }

    private int enemyHit(){
        Random random = new Random();
        return random.nextInt(2)+1;
    }


}
