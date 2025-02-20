package core_programming.string.level3_problems;

import java.util.Scanner;

public class AnagramChecker {
    public static boolean areAnagrams(String text1, String text2) {
        // Remove spaces and convert to lowercase
        text1 = text1.replaceAll("\\s", "").toLowerCase();
        text2 = text2.replaceAll("\\s", "").toLowerCase();

        // Check if lengths are different
        if (text1.length() != text2.length()) {
            return false;
        }

        // Create frequency arrays
        int[] frequency1 = new int[256];
        int[] frequency2 = new int[256];

        // Count character frequencies
        for (int i = 0; i < text1.length(); i++) {
            frequency1[text1.charAt(i)]++;
            frequency2[text2.charAt(i)]++;
        }

        // Compare frequencies
        for (int i = 0; i < 256; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String text1 = scanner.nextLine();

        System.out.print("Enter second string: ");
        String text2 = scanner.nextLine();

        if (areAnagrams(text1, text2)) {
            System.out.println("\nThe strings are anagrams.");
        } else {
            System.out.println("\nThe strings are not anagrams.");
        }

        scanner.close();
    }
}
