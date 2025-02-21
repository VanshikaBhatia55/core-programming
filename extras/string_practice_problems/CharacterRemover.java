package core_programming.extras.string_practice_problems;

import java.util.Scanner;

public class CharacterRemover {
    public static String removeCharacter(String str, char charToRemove) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != charToRemove) {
                result.append(str.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        System.out.print("Enter character to remove: ");
        char ch = scanner.next().charAt(0);
        System.out.println("Modified string: " + removeCharacter(input, ch));
        scanner.close();
    }
}
