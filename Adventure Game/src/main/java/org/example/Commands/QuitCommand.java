package org.example.Commands;

public class QuitCommand extends Command{
    public QuitCommand(){
        System.out.println("Thank you for playing my Adventure game!");
        System.exit(0);
    }
}
