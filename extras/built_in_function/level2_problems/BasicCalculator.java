package core_programming.extras.built_in_function.level2_problems;

import java.util.Scanner;

public class BasicCalculator {
    private static double add(double a, double b) { return a + b; }
    private static double subtract(double a, double b) { return a - b; }
    private static double multiply(double a, double b) { return a * b; }
    private static double divide(double a, double b) { return a / b; }

    private static void displayMenu() {
        System.out.println("\nCalculator Operations:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Exit");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            displayMenu();
            System.out.print("Choose operation (1-5): ");
            int choice = scanner.nextInt();

            if (choice == 5) break;

            if (choice < 1 || choice > 4) {
                System.out.println("Invalid choice!");
                continue;
            }

            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            switch (choice) {
                case 1:
                    result = add(num1, num2);
                    System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, result);
                    break;
                case 2:
                    result = subtract(num1, num2);
                    System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, result);
                    break;
                case 3:
                    result = multiply(num1, num2);
                    System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, result);
                    break;
                case 4:
                    if (num2 == 0) {
                        System.out.println("Cannot divide by zero!");
                    } else {
                        result = divide(num1, num2);
                        System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, result);
                    }
                    break;
            }
        }
        scanner.close();
    }
}