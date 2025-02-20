package core_programming.string.level2_problems;

import java.util.Scanner;

public class CustomStringLength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.next();

        int customLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Custom length: " + customLength);
        System.out.println("Built-in length: " + builtInLength);
    }

    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }
}
