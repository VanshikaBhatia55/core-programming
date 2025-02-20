package core_programming.string.level1_problems;

import java.util.Scanner;

public class IllegalArgumentDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.next();

        generateException(text);
        handleException(text);
    }

    public static void generateException(String text) {
        // This will throw IllegalArgumentException
        text.substring(5, 2);
    }

    public static void handleException(String text) {
        try {
            text.substring(5, 2);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        }
    }
}
