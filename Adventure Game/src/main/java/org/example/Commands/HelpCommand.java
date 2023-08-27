package org.example.Commands;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HelpCommand {
    public HelpCommand(){
        File file = new File("C:\\Users\\camer\\OneDrive\\Documents\\GitHub\\adventure_game\\Adventure Game\\src\\main\\java\\org\\example\\Commands\\Commands.txt");
        Scanner sc = null;
        try {
            sc = new Scanner(file);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        while (sc.hasNextLine())
            System.out.println(sc.nextLine());
    }
    }

