package core_programming.string.level1_problems;

import java.util.Scanner;

public class LowercaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();

        String customLower = convertToLowerCase(text);
        String builtInLower = text.toLowerCase();

        boolean areEqual = compareStrings(customLower, builtInLower);
        System.out.println("Custom lowercase: " + customLower);
        System.out.println("Built-in lowercase: " + builtInLower);
        System.out.println("Results match: " + areEqual);
    }

    public static String convertToLowerCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                result.append((char)(c + 32));
            } else {
                result.append(c);
            }
        }
        return result.toString();
    }

    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}
