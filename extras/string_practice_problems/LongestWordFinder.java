package core_programming.extras.string_practice_problems;

import java.util.Scanner;

public class LongestWordFinder {
    public static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        System.out.println("Longest word: " + findLongestWord(input));
        scanner.close();
    }
}
