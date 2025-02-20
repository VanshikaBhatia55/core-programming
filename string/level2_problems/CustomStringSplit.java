package core_programming.string.level2_problems;

import java.util.Scanner;

public class CustomStringSplit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();

        String[] customSplit = splitText(text);
        String[] builtInSplit = text.split(" ");

        boolean areEqual = compareArrays(customSplit, builtInSplit);
        System.out.println("Custom split and built-in split match: " + areEqual);
    }

    public static String[] splitText(String text) {
        // Count words first
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Create arrays for word indexes and words
        int[] spaceIndexes = new int[wordCount + 1];
        String[] words = new String[wordCount];

        // Find space indexes
        spaceIndexes[0] = -1;
        int spaceCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceCount++] = i;
            }
        }
        spaceIndexes[spaceCount] = text.length();

        // Extract words
        for (int i = 0; i < wordCount; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word.append(text.charAt(j));
            }
            words[i] = word.toString();
        }

        return words;
    }

    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
}
