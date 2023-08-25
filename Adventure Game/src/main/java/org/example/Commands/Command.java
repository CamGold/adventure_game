package org.example.Commands;

public class Command {
    public static boolean isNumeric(String secondArg) {
        if (secondArg == null) {
            return true;
        }
        try {
            int stringNumber = Integer.parseInt(secondArg);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }
}
