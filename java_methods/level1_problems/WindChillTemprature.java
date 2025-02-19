package core_programming.java_methods.level1_problems;

import java.util.Scanner;

public class WindChillTemprature {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Fahrenheit: ");
        double temperature = input.nextDouble(); // Temperature in Fahrenheit
        System.out.print("Enter the wind speed in miles per hour: ");
        double windSpeed = input.nextDouble(); // Wind speed in mph

        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.printf("The wind chill temperature is : %.2fF" , windChill);
    }

    public static double calculateWindChill(double temperature, double windSpeed){
        // Wind chill formula
        return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }
}
