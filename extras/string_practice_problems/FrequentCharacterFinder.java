package core_programming.extras.string_practice_problems;

import java.util.Scanner;

public class FrequentCharacterFinder {
    public static char findMostFrequentChar(String str) {
        int[] frequency = new int[256];

        for (int i = 0; i < str.length(); i++) {
            frequency[str.charAt(i)]++;
        }

        char result = str.charAt(0);
        int maxFreq = frequency[result];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (frequency[ch] > maxFreq) {
                maxFreq = frequency[ch];
                result = ch;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.println("Most frequent character: " + findMostFrequentChar(input));
        scanner.close();
    }
}

