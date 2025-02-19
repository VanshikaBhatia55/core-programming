package core_programming.java_methods.level2_problems;

import java.util.Scanner;

public class UnitConverter3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Convert Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = input.nextDouble();
        double celsiusConverted = convertFahrenheitToCelsius(fahrenheit);
        System.out.printf("%.2f Fahrenheit is equal to %.2f Celsius.%n%n", fahrenheit, celsiusConverted);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = input.nextDouble();
        double fahrenheitConverted = convertCelsiusToFahrenheit(celsius);
        System.out.printf("%.2f Celsius is equal to %.2f Fahrenheit.%n%n", celsius, fahrenheitConverted);

        System.out.print("Enter weight in pounds: ");
        double pounds = input.nextDouble();
        double kgConverted = convertPoundsToKilograms(pounds);
        System.out.printf("%.2f pounds is equal to %.2f kilograms.%n%n", pounds, kgConverted);

        System.out.print("Enter weight in kilograms: ");
        double kilograms = input.nextDouble();
        double poundsConverted = convertKilogramsToPounds(kilograms);
        System.out.printf("%.2f kilograms is equal to %.2f pounds.%n%n", kilograms, poundsConverted);

        System.out.print("Enter volume in gallons: ");
        double gallons = input.nextDouble();
        double litersConverted = convertGallonsToLiters(gallons);
        System.out.printf("%.2f gallons is equal to %.2f liters.%n%n", gallons, litersConverted);

        // Convert liters to gallons
        System.out.print("Enter volume in liters: ");
        double liters = input.nextDouble();
        double gallonsConverted = convertLitersToGallons(liters);
        System.out.printf("%.2f liters is equal to %.2f gallons.%n", liters, gallonsConverted);

    }


    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32; // Convert Celsius to Fahrenheit
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }
}
