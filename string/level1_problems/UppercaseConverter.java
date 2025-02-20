package core_programming.string.level1_problems;

import java.util.Scanner;

public class UppercaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = scanner.nextLine();

        String customUpper = convertToUpperCase(text);
        String builtInUpper = text.toUpperCase();

        boolean areEqual = compareStrings(customUpper, builtInUpper);
        System.out.println("Custom uppercase: " + customUpper);
        System.out.println("Built-in uppercase: " + builtInUpper);
        System.out.println("Results match: " + areEqual);
    }

    public static String convertToUpperCase(String str) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c >= 'a' && c <= 'z') {
                result.append((char)(c - 32));
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
