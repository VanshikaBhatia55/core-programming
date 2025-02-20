package core_programming.string.level2_problems;

import java.util.Scanner;

public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = input.nextLine();

        int[] counts = countVowelsConsonants(text);

        System.out.println("\nResults:");
        System.out.println("Vowels: " + counts[0]);
        System.out.println("Consonants: " + counts[1]);

    }

    public static boolean isVowel(char c) {
        c = toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u';
    }

    public static char toLowerCase(char c) {
        if (c >= 'A' && c <= 'Z') {
            return (char)(c + 32);
        }
        return c;
    }

    public static int[] countVowelsConsonants(String text) {
        int vowels = 0, consonants = 0;

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                if (isVowel(c)) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        return new int[]{vowels, consonants};
    }
}

