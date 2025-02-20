package core_programming.string.level2_problems;

import java.util.Scanner;

public class CustomStringTrimmer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text with spaces:");
        String text = scanner.nextLine();

        int[] bounds = findTrimBounds(text);
        String customTrimmed = createSubstring(text, bounds[0], bounds[1]);
        String builtInTrimmed = text.trim();

        boolean areEqual = compareStrings(customTrimmed, builtInTrimmed);

        System.out.println("\nResults:");
        System.out.println("Original text: '" + text + "'");
        System.out.println("Custom trimmed: '" + customTrimmed + "'");
        System.out.println("Built-in trimmed: '" + builtInTrimmed + "'");
        System.out.println("Both methods match: " + areEqual);

        scanner.close();
    }

    public static int[] findTrimBounds(String str) {
        int start = 0;
        int end = str.length() - 1;

        while (start < str.length() && str.charAt(start) == ' ') {
            start++;
        }

        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end + 1};
    }

    public static String createSubstring(String str, int start, int end) {
        StringBuilder result = new StringBuilder();
        for (int i = start; i < end; i++) {
            result.append(str.charAt(i));
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
