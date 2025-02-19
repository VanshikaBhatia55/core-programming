package core_programming.java_methods.level3_problems;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);

        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Check if the number is a duck number
        boolean isDuckNumber = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuckNumber);

        // Check if the number is an Armstrong number
        boolean isArmstrongNumber = isArmstrongNumber(number,digits, digitCount);
        System.out.println("Is Armstrong Number: " + isArmstrongNumber);

        // Find largest and second largest elements
        int[] largestElements = findLargest(digits);
        System.out.println("Largest: " + largestElements[0] + ", Second Largest: " + largestElements[1]);

        // Find smallest and second smallest elements
        int[] smallestElements = findSmallest(digits);
        System.out.println("Smallest: " + smallestElements[0] + ", Second Smallest: " + smallestElements[1]);
    }


    public static int countDigits(int number) {
        number = Math.abs(number);
        int count = 0;
        if (number == 0) {
            return 1; // Special case for 0
        }
        while (number > 0) {
            count++;
            number /= 10;
        }
        return count;
    }

    // Method to store the digits of the number in an array
    public static int[] storeDigits(int number) {
        int last = countDigits(number);
        int[] digits = new int[last];
        number = Math.abs(number); // Handle negative numbers
        for (int i = last - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
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

    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int originalNumber ,int[] digits, int digitCount) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, digitCount); // Sum of digits raised to the power of digit count
        }
        return sum == originalNumber; // Check if sum equals the original number
    }

    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest; // Update second largest
                largest = digit; // Update largest
            } else if (digit > secondLargest && digit < largest) {
                secondLargest = digit; // Update second largest
            }
        }
        return new int[]{largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest; // Update second smallest
                smallest = digit; // Update smallest
            } else if (digit < secondSmallest && digit > smallest) {
                secondSmallest = digit; // Update second smallest
            }
        }
        return new int[]{smallest, secondSmallest};

    }
}
