package core_programming.string.level1_problems;

import java.util.Scanner;

public class StringComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string:");
        String str1 = scanner.next();
        System.out.print("Enter second string:");
        String str2 = scanner.next();

        boolean customCompare = compareStrings(str1, str2);
        boolean builtInCompare = str1.equals(str2);

        System.out.println("Custom comparison result: " + customCompare);
        System.out.println("Built-in comparison result: " + builtInCompare);
        System.out.println("Both methods match: " + (customCompare == builtInCompare));
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
