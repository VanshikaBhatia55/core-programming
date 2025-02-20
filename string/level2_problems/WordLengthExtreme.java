package core_programming.string.level2_problems;

import java.util.Scanner;

public class WordLengthExtreme {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();

        String[] words = splitText(text);
        String[][] wordLengths = getWordLengths(words);
        String[] extremes = findExtremes(wordLengths);

        System.out.println("\nResults:");
        System.out.println("Shortest word: " + extremes[0]);
        System.out.println("Longest word: " + extremes[1]);

        scanner.close();
    }

    public static String[] splitText(String text) {
        int wordCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        int[] spaceIndexes = new int[wordCount + 1];

        spaceIndexes[0] = -1;
        int spaceCount = 1;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                spaceIndexes[spaceCount++] = i;
            }
        }
        spaceIndexes[spaceCount] = text.length();

        for (int i = 0; i < wordCount; i++) {
            StringBuilder word = new StringBuilder();
            for (int j = spaceIndexes[i] + 1; j < spaceIndexes[i + 1]; j++) {
                word.append(text.charAt(j));
            }
            words[i] = word.toString();
        }

        return words;
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

    public static String[][] getWordLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    public static String[] findExtremes(String[][] wordLengths) {
        String shortest = wordLengths[0][0];
        String longest = wordLengths[0][0];
        int shortestLen = Integer.parseInt(wordLengths[0][1]);
        int longestLen = Integer.parseInt(wordLengths[0][1]);

        for (String[] wordLength : wordLengths) {
            int len = Integer.parseInt(wordLength[1]);
            if (len < shortestLen) {
                shortest = wordLength[0];
                shortestLen = len;
            }
            if (len > longestLen) {
                longest = wordLength[0];
                longestLen = len;
            }
        }

        return new String[]{shortest, longest};
    }
}
