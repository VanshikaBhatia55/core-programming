package core_programming.java_methods.level3_problems;

import java.util.Scanner;

public class NumberChecker5{

    // Method to find factors of a number
    public static int[] getFactors(int number) {
        int count = 0;
        // First loop to count factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }

        // Create array with exact size
        int[] factors = new int[count];
        int index = 0;

        // Second loop to store factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find greatest factor
    public static int getGreatestFactor(int number) {
        int[] factors = getFactors(number);
        return factors[factors.length - 1];
    }

    // Method to find sum of factors
    public static int getSumOfFactors(int number) {
        int[] factors = getFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find product of factors
    public static long getProductOfFactors(int number) {
        int[] factors = getFactors(number);
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find product of cube of factors
    public static long getProductOfCubeOfFactors(int number) {
        int[] factors = getFactors(number);
        long product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if number is perfect
    public static boolean isPerfectNumber(int number) {
        int[] factors = getFactors(number);
        int sum = 0;
        // Sum all factors except the number itself
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        return sum == number;
    }

    // Method to check if number is abundant
    public static boolean isAbundantNumber(int number) {
        int[] factors = getFactors(number);
        int sum = 0;
        // Sum all factors except the number itself
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        return sum > number;
    }

    // Method to check if number is deficient
    public static boolean isDeficientNumber(int number) {
        int[] factors = getFactors(number);
        int sum = 0;
        // Sum all factors except the number itself
        for (int i = 0; i < factors.length - 1; i++) {
            sum += factors[i];
        }
        return sum < number;
    }

    // Helper method to calculate factorial
    private static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    // Method to check if number is strong
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        return sum == originalNumber;
    }

    // Main method to test all functionalities
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of number : ");
        int number = input.nextInt();
        System.out.println();


        System.out.print("Factors: ");
        int[] factors = getFactors(number);
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        System.out.println("Greatest factor: " + getGreatestFactor(number));
        System.out.println("Sum of factors: " + getSumOfFactors(number));
        System.out.println("Product of factors: " + getProductOfFactors(number));
        System.out.println("Product of cube of factors: " + getProductOfCubeOfFactors(number));
        System.out.println("Is "+ number + " a  perfect number? " + isPerfectNumber(number));
        System.out.println("Is "+ number + " an abundant number? " + isAbundantNumber(number));
        System.out.println("Is "+ number + " a  deficient number? " + isDeficientNumber(number));
        System.out.println("Is "+ number + " a strong number? " + isStrongNumber(number));

    }
}