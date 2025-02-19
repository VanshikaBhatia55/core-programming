package core_programming.java_methods.level3_problems;

import java.util.Scanner;

public class NumberChecker2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        System.out.println();

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

        // Find the sum of the digits
        int sumOfDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumOfDigits);

        // Find the sum of the squares of the digits
        int sumOfSquares = sumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);

        // Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number, sumOfDigits);
        System.out.println("Is Harshad Number: " + isHarshad);
        System.out.println();

        // Find the frequency of each digit
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
                if(frequency[i][1] > 0){
                    System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1]);
                }
        }
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

    // Method to find the sum of the digits
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit; // Add each digit to the sum
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2); // Add the square of each digit to the sum
        }
        return sum;
    }

    // Method to check if the number is a Harshad number
    public static boolean isHarshadNumber(int number, int sumOfDigits) {
        return number % sumOfDigits == 0; // Check if the number is divisible by the sum of its digits
    }

    // Method to find the frequency of each digit
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 10 digits (0-9), first column for digit, second for frequency

        // Initialize frequency array
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // Set the digit
            frequency[i][1] = 0; // Initialize frequency to 0
        }

        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]][1]++;
        }

        return frequency; // Return the frequency array
    }
}
