package core_programming.java_methods.level2_problems;

import java.util.Scanner;

public class UnitConverter {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter the distance in kilometers: ");
            double km = input.nextDouble();
            System.out.print("Enter the distance in Miles: ");
            double miles = input.nextDouble();
            System.out.print("Enter the value in Meters: ");
            double meters = input.nextDouble();
            System.out.print("Enter the value in Feet: ");
            double feets = input.nextDouble();

            System.out.println();



            // Call the method to convert km to miles
            double milesConverted = convertKmToMiles(km);
            System.out.printf("%.2f kilometers is equal to %.2f miles.%n", km, milesConverted);

            double kmConverted = convertMilesToKm(miles);
            System.out.printf("%.2f miles is equal to %.2f kilometers.%n", miles, kmConverted);

            double feetConverted = convertMetersTOFeet(meters);
            System.out.printf("%.2f meters is equal to %.2f feet.%n", meters, feetConverted);

            double metersConverted = convertFeetToMeters(feets);
            System.out.printf("%.2f feet is equal to %.2f meters.%n", feets, metersConverted);
        }

    // Method To convert kilometers to miles and return the value
    public static double convertKmToMiles(double km){
        double km2miles = 0.621371;
        double miles = km * km2miles;
        return miles;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles){
        double miles2Km = 1.60934;
        double km = miles * miles2Km;
    return km;
}

    // Method to convert meters to feet
    public static double convertMetersTOFeet(double meters){
        double meters2feet = 3.28084;
        double feet = meters * meters2feet;
        return feet;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }
}
