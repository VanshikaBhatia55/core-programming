package core_programming.string.level3_problems;

import java.util.Scanner;

public class PalindromeChecker {
    // Method 1: Iterative approach
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Method 2: Recursive approach
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Method 3: Array approach
    public static boolean isPalindromeArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];

        // Create reverse array
        for (int i = 0; i < original.length; i++) {
            reverse[i] = text.charAt(text.length() - 1 - i);
        }

        // Compare arrays
        for (int i = 0; i < original.length; i++) {
            if (original[i] != reverse[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        System.out.println("\nResults using different methods:");
        System.out.println("1. Iterative method: " +
                (isPalindromeIterative(text) ? "Palindrome" : "Not a palindrome"));

        System.out.println("2. Recursive method: " +
                (isPalindromeRecursive(text, 0, text.length() - 1) ? "Palindrome" : "Not a palindrome"));

        System.out.println("3. Array method: " +
                (isPalindromeArray(text) ? "Palindrome" : "Not a palindrome"));

        scanner.close();
    }
}
