package core_programming.extras.string_practice_problems;

import java.util.Scanner;

public class WordReplacer {
    public static String replaceWord(String sentence, String oldWord, String newWord) {
        StringBuilder result = new StringBuilder();
        String[] words = sentence.split("\\s+");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(oldWord)) {
                result.append(newWord);
            } else {
                result.append(words[i]);
            }
            if (i < words.length - 1) {
                result.append(" ");
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        System.out.print("Enter word to replace: ");
        String oldWord = scanner.nextLine();
        System.out.print("Enter new word: ");
        String newWord = scanner.nextLine();
        System.out.println("Modified sentence: " + replaceWord(sentence, oldWord, newWord));
        scanner.close();
    }
}
