package core_programming.string.level1_problems;

import java.util.Scanner;

public class StringIndexDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.next();

        generateException(text);
        handleException(text);
    }

    public static void generateException(String text) {
        // This will throw StringIndexOutOfBoundsException
        System.out.println(text.charAt(text.length() + 1));
    }

    public static void handleException(String text) {
        try {
            System.out.println(text.charAt(text.length() + 1));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
