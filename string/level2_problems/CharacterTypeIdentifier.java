package core_programming.string.level2_problems;

import java.util.Scanner;

public class CharacterTypeIdentifier {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();

        String[][] charTypes = getCharacterTypes(text);
        displayCharacterTypes(charTypes);

        scanner.close();
    }

    public static String[][] getCharacterTypes(String text) {
        String[][] result = new String[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            result[i][0] = String.valueOf(c);

            if ((c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z')) {
                result[i][1] = isVowel(c) ? "Vowel" : "Consonant";
            } else {
                result[i][1] = "Not a Letter";
            }
        }

        return result;
    }

    public static void displayCharacterTypes(String[][] charTypes) {
        System.out.println("\nCharacter Analysis:");
        System.out.println("-------------------------");
        System.out.println("Character\tType");
        System.out.println("-------------------------");
        for (String[] charType : charTypes) {
            System.out.println(charType[0] + "\t\t" + charType[1]);
        }
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
}
