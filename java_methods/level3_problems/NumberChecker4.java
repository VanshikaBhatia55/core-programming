package core_programming.java_methods.level3_problems;

import java.util.Scanner;

public class NumberChecker4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Check if the number is prime
        boolean isPrime = isPrimeNumber(number);
        System.out.println("Is Prime Number: " + isPrime);

        // Check if the number is a neon number
        boolean isNeon = isNeonNumber(number);
        System.out.println("Is Neon Number: " + isNeon);

        // Check if the number is a spy number
        boolean isSpy = isSpyNumber(number);
        System.out.println("Is Spy Number: " + isSpy);

        // Check if the number is an automorphic number
        boolean isAutomorphic = isAutomorphicNumber(number);
        System.out.println("Is Automorphic Number: " + isAutomorphic);

        // Check if the number is a buzz number
        boolean isBuzz = isBuzzNumber(number);
        System.out.println("Is Buzz Number: " + isBuzz);

        input.close(); // Close the scanner to prevent resource leaks
    }

    // Method to check if a number is a prime number
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Found a divisor, not prime
            }
        }
        return true; // No divisors found, it is prime
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sumOfDigits = 0;

        while (square > 0) {
            sumOfDigits += square % 10; // Add last digit to sum
            square /= 10; // Remove last digit
        }

        return sumOfDigits == number; // Check if sum of digits equals the original number
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0;
        int product = 1;

        while (number > 0) {
            int digit = number % 10; // Get last digit
            sum += digit; // Add to sum
            product *= digit; // Multiply to product
            number /= 10; // Remove last digit
        }

        return sum == product; // Check if sum equals product
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        String squareStr = String.valueOf(square);
        String numberStr = String.valueOf(number);

        return squareStr.endsWith(numberStr); // Check if square ends with the original number
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || String.valueOf(number).endsWith("7"); // Check divisibility by 7 or ending with 7
    }
}
