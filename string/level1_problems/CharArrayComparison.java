package core_programming.string.level1_problems;

import java.util.Scanner;

public class CharArrayComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String text = scanner.next();

        char[] customArray = getCharArray(text);
        char[] builtInArray = text.toCharArray();

        boolean areEqual = compareCharArrays(customArray, builtInArray);
        System.out.println("Arrays match: " + areEqual);
    }

    public static char[] getCharArray(String str) {
        char[] result = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
        }
        return result;
    }

    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }

        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
