package core_programming.extras.built_in_function.level2_problems;

import java.util.Scanner;

public class FactorialCalculator {
    private static long calculateFactorial(int n) {
        if (n <= 1) return 1;
        return n * calculateFactorial(n - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers");
        } else {
            System.out.println("Factorial: " + calculateFactorial(number));
        }
        scanner.close();
    }
}