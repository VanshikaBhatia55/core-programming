package core_programming.extras.built_in_function.level2_problems;

import java.util.Scanner;

public class TemperatureConverter {
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose conversion (1/2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            System.out.printf("%.2f°C = %.2f°F%n", celsius, celsiusToFahrenheit(celsius));
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            System.out.printf("%.2f°F = %.2f°C%n", fahrenheit, fahrenheitToCelsius(fahrenheit));
        } else {
            System.out.println("Invalid choice!");
        }
        scanner.close();
    }
}

