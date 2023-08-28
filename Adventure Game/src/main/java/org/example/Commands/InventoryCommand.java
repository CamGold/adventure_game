package org.example.Commands;

import org.example.Items.Item;
import org.example.Player.Player;
import org.example.World.World;

import java.util.List;
import java.util.Scanner;

public class InventoryCommand {

    private Player player;
    private World world;
    private Scanner scanner;

    public InventoryCommand(Player player, World world){
        this.player = player;
        this.world = world;
        if(player.getInventory().isEmpty()){
            System.out.println("Your inventory is empty.");
        }else{
        listItems(player.getInventory());
        }
    }

    private void listItems(List<Item> inventory){
        scanner = new Scanner(System.in);
        int count = 1;
        for(Item item : player.getInventory() ){
            System.out.println(count+ ". " + item);
            count++;
        }
        System.out.println(count + ". back");
        int option = Integer.parseInt(scanner.nextLine());
        if(option == count){
            System.out.println(" ");
        }else{
        itemMenu(player.getInventory().get(option-1));
        }
    }

    private void itemMenu(Item item){
        switch (item.getType()){
            case Food -> {
                foodMenu(item);
            }
            case Armor -> {
                armorMenu(item);
            }
            case Weapon -> {
                weaponMenu(item);
            }
        }
    }

    private void foodMenu(Item item){
        scanner = new Scanner(System.in);
        System.out.println("Would you like to eat the " +item.getName()+" Y/N");
        String answer = scanner.nextLine().toLowerCase();
        switch (answer){
            case "y" -> player.eat(item);
            case "n" -> listItems(player.getInventory());
            default -> System.out.println("Please enter a valid answer.");
        }

    }
    private void armorMenu(Item item){
        scanner = new Scanner(System.in);
        System.out.println("Would you like to equip the " +item.getName()+" Y/N");
        String answer = scanner.nextLine().toLowerCase();
        switch (answer){
            case "y" -> player.updateDefence(item.getItemValue());
            case "n" -> listItems(player.getInventory());
            default -> System.out.println("Please enter a valid answer.");
        }

    }
    private void weaponMenu(Item item){
        scanner = new Scanner(System.in);
        System.out.println("Would you like to equip the " +item.getName()+" Y/N");
        String answer = scanner.nextLine().toLowerCase();
        switch (answer){
            case "y" -> player.updateDamage(item.getItemValue());
            case "n" -> listItems(player.getInventory());
            default -> System.out.println("Please enter a valid answer.");
        }

    }
}
