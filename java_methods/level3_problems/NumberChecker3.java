package core_programming.java_methods.level3_problems;

import java.util.Scanner;

public class NumberChecker3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        // Store digits in an array
        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Reverse the digits array
        int[] reversedDigits = reverseArray(digits);
        System.out.print("Reversed Digits: ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Check if the number is a palindrome
        boolean isPalindrome = isPalindrome(digits);
        System.out.println("Is Palindrome: " + isPalindrome);

        // Check if the number is a duck number
        boolean isDuckNumber = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuckNumber);

        input.close(); // Close the scanner to prevent resource leaks
    }

    // Method to count the digits in the number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length(); // Count digits, handle negative numbers
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        int last = countDigits(number);
        int[] digits = new int[last];
        for (int i = last - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i]; // Reverse the array
        }
        return reversed;
    }

    // Method to check if the number is a palindrome
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseArray(digits); // Get the reversed array
        return compareArrays(digits, reversed); // Compare original and reversed arrays
    }

    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false; // Arrays are not equal if lengths differ
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false; // Return false if any elements differ
            }
        }
        return true; // Arrays are equal
    }

    // Method to check if the number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit == 0) {
                return true; // Duck number has a zero digit
            }
        }
        return false; // No zero digit found
    }
}
