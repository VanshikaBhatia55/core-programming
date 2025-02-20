package core_programming.string.level2_problems;
import java.util.Scanner;

public class WordLengthAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();

        // Split text into words
        String[] words = splitText(text);

        // Get 2D array of words and their lengths
        String[][] wordLengths = getWordLengths(words);

        // Display results in tabular format
        System.out.println("\nWord Analysis:");
        System.out.println("----------------");
        System.out.println("Word\tLength");
        System.out.println("----------------");
        for (String[] wordLength : wordLengths) {
            System.out.println(wordLength[0] + "\t" + Integer.parseInt(wordLength[1]));
        }

        scanner.close();
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
            result[i][0] = words[i];                           // Store the word
            result[i][1] = String.valueOf(findLength(words[i])); // Store the length as string
        }
        return result;
    }
}