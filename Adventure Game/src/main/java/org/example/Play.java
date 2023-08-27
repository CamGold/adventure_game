package org.example;

import org.example.Commands.CommandHandler;
import org.example.Player.Inventory;
import org.example.Player.Player;
import org.example.World.World;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class Play {

    private World world;
    private Player player;

    private Scanner scanner;
    public boolean play = true;

    private CommandHandler handler = new CommandHandler();

    private Inventory inventory;

    public Play(Player player, World world){

        this.player = player;
        this.world = world;

        scanner = new Scanner(System.in);
        while(player.getHealth()>0) {
            String command = getInput("What is your command");
            try {
                handler.handleCommand(command, player, world);
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
            System.out.println(player);
        }

        System.out.println("You have died! HAHA");

    }

    private String getInput(String prompt){
        System.out.println(prompt);
        String output = scanner.nextLine();
        return output;
    }


}
