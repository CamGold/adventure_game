package org.example.Player;

import org.example.Items.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inventory {
    private Scanner scanner;
    private Player player;

    public Inventory(Player player){
        this.player = player;
        this.scanner = new Scanner(System.in);
    }

    public void addToInventory(Item item){
        System.out.println("You have come across a " + item.getName()+"\nWould you like to pick it up? Y/N");
        String answer = scanner.nextLine().toLowerCase();
        switch (answer){
            case "y" -> player.addToInventory(item);
            case "n" -> System.out.println("You have left the "+item.getName()+" behind");
        }

    }



}
