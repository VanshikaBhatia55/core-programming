package core_programming.string.level1_problems;

import java.util.Scanner;

public class NumberFormatDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-numeric string:");
        String text = scanner.next();

        generateException(text);
        handleException(text);
    }

    public static void generateException(String text) {
        // This will throw NumberFormatException
        int number = Integer.parseInt(text);
    }

    public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }
}
