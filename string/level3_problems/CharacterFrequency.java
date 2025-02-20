package core_programming.string.level3_problems;

import java.util.Scanner;

public class CharacterFrequency {
    public static String[][] findFrequency(String text) {
        int[] frequency = new int[256];

        // Count frequency of each character
        for (int i = 0; i < text.length(); i++) {
            frequency[text.charAt(i)]++;
        }

        // Count number of unique characters
        int uniqueChars = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                uniqueChars++;
            }
        }

        // Create and fill result array
        String[][] result = new String[uniqueChars][2];
        int index = 0;
        for (int i = 0; i < 256; i++) {
            if (frequency[i] > 0) {
                result[index][0] = String.valueOf((char)i);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[][] frequency = findFrequency(text);

        System.out.println("\nCharacter frequencies:");
        System.out.printf("%-12s %-12s%n", "Character", "Frequency");
        System.out.println("------------------------");
        for (String[] entry : frequency) {
            System.out.printf("%-12s %-12s%n", entry[0], entry[1]);
        }

        scanner.close();
    }
}
