package core_programming.extras.built_in_function.level2_problems;

import java.util.Scanner;

public class FibonacciGenerator {
    private static void generateFibonacci(int terms) {
        long first = 0, second = 1;

        System.out.println("Fibonacci sequence:");
        for (int i = 0; i < terms; i++) {
            System.out.print(first + " ");
            long sum = first + second;
            first = second;
            second = sum;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = scanner.nextInt();
        generateFibonacci(terms);
        scanner.close();
    }
}