package core_programming.extras.built_in_function.level2_problems;

import java.util.Scanner;

public class MaximumOfThree {
    private static Scanner scanner = new Scanner(System.in);

    private static int getInput(String prompt) {
        System.out.print(prompt);
        return scanner.nextInt();
    }

    private static int findMaximum(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static void main(String[] args) {
        int num1 = getInput("Enter first number: ");
        int num2 = getInput("Enter second number: ");
        int num3 = getInput("Enter third number: ");

        int max = findMaximum(num1, num2, num3);
        System.out.println("Maximum number is: " + max);
        scanner.close();
    }
}

