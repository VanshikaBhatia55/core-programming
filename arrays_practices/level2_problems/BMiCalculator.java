package core_programming.arrays_practices.level2_problems;

import java.util.Scanner;

public class BMiCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of persons: ");
        int numberOfPersons = input.nextInt();
        System.out.println();

        // Create arrays to store weight, height, BMI, and weight status
        double[] weightKg = new double[numberOfPersons]; // Array to store weights in kg
        double[] heightMeter = new double[numberOfPersons]; // Array to store heights in meters
        double[] BMI = new double[numberOfPersons]; // Array to store calculated BMI values
        String[] weightStatus = new String[numberOfPersons]; // Array to store weight status

        // Loop to take input for weight and height for each person
        for (int i = 0; i < numberOfPersons; i++) {
            // Input weight for the current person
            System.out.print("Enter weight for person " + (i + 1) + " : ");
            weightKg[i] = input.nextDouble();

            // Input height for the current person
            System.out.print("Enter height for person " + (i + 1) + " : ");
            heightMeter[i] = input.nextDouble();
            System.out.println();

            // Calculate BMI using the formula: weight / (height * height)
            BMI[i] = weightKg[i] / (heightMeter[i] * heightMeter[i]);

            // Determine weight status based on BMI value
            if (BMI[i] < 18.5) {
                weightStatus[i] = "Underweight"; // BMI less than 18.5
            } else if (BMI[i] >= 18.5 && BMI[i] < 24.9) {
                weightStatus[i] = "Normal"; // BMI between 18.5 and 24.9
            } else if (BMI[i] >= 25.0 && BMI[i] < 30.0) {
                weightStatus[i] = "Overweight"; // BMI between 25.0 and 29.9
            } else {
                weightStatus[i] = "Obese"; // BMI 30.0 and above
            }
        }

        // Displayed the results for each person
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Weight of person " + (i + 1) + " : " + weightKg[i]);
            System.out.println("Height of person " + (i + 1) + " : " + heightMeter[i]);
            System.out.println("BMI of person " + (i + 1) + " : " + BMI[i]);
            System.out.println("Weight Status of person " + (i + 1) + " : " + weightStatus[i]);
            System.out.println(); // Print a blank line for better readability
        }

    }
}