package org.example;

import org.example.Player.Player;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    static Scanner scanner;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        String name = getInput("What would you like to name your Character?: ");
        System.out.println("Hello "+name);
        Player player = new Player(name);
        System.out.println(player);
    }
    private static String getInput(String prompt){
        System.out.println(prompt);
        String input = scanner.nextLine();

        while(input.isBlank()){
            System.out.println(prompt);
            input = scanner.nextLine();
        }
        return input;
    }
}