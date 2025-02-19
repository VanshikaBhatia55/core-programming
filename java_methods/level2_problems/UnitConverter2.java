package core_programming.java_methods.level2_problems;

import java.util.Scanner;

public class UnitConverter2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of yards: ");
        double yards = input.nextDouble();
        double feetConverted = convertYardsToFeet(yards);
        System.out.printf("%.2f yards is equal to %.2f feet.%n", yards, feetConverted);

        System.out.print("Enter the number of feet: ");
        double feet = input.nextDouble();
        double yardsConverted = convertFeetToYards(feet);
        System.out.printf("%.2f feet is equal to %.2f yards.%n", feet, yardsConverted);

        System.out.print("Enter the number of meters: ");
        double meters = input.nextDouble();
        double inchesConverted = convertMetersToInches(meters);
        System.out.printf("%.2f meters is equal to %.2f inches.%n", meters, inchesConverted);

        System.out.print("Enter the number of inches: ");
        double inches = input.nextDouble();
        double metersConverted = convertInchesToMeters(inches);
        System.out.printf("%.2f inches is equal to %.2f meters.%n", inches, metersConverted);

        System.out.print("Enter the number of inches to convert to centimeters: ");
        inches = input.nextDouble();
        double centimetersConverted = convertInchesToCentimeters(inches);
        System.out.printf("%.2f inches is equal to %.2f centimeters.%n", inches, centimetersConverted);
    }

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        double yards2feet = 3.0;
        return yards * yards2feet;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        double feet2yards = 0.333333; // 1 foot = 1/3 yard
        return feet * feet2yards;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        return meters * meters2inches;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        return inches * inches2meters;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        double inches2cm = 2.54;
        return inches * inches2cm;
    }
}
