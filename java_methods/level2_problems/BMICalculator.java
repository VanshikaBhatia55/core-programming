package core_programming.java_methods.level2_problems;

import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[][] personData = new double[10][3];
        String[] bmiStatus = new String[10];

        for (int i = 0; i < personData.length; i++) {
            while (true) {
                System.out.print("Enter weight in kgs of person " + (i + 1) + " : ");
                personData[i][0] = input.nextDouble(); // Store weight in the first column
                if (personData[i][0] <= 0) {
                    System.out.println("Enter positive value.");
                    continue;
                }
                break;
            }

            while (true) {
                System.out.print("Enter height in centimeters of person " + (i + 1) + " : ");
                personData[i][1] = input.nextDouble(); // Store height in the second column
                if (personData[i][1] <= 0) {
                    System.out.println("Enter positive value.");
                    continue;
                }
                break;
            }
            System.out.println();
        }

        calculateBMI(personData);
        bmiStatus = determineBMIStatus(personData);

        System.out.println("BMI Report:");
        for (int i = 0; i < personData.length; i++) {
            System.out.printf("Person %d: Weight: %.2f kg, Height: %.2f cm, BMI: %.2f, Status: %s%n",
                    (i + 1), personData[i][0], personData[i][1], personData[i][2], bmiStatus[i]);
        }
    }

    public static void calculateBMI(double[][] personData) {
        for (int i = 0; i < personData.length; i++) {
            double weight = personData[i][0];
            double heightInMeters = personData[i][1] / 100; // Convert height from cm to meters
            personData[i][2] = weight / (heightInMeters * heightInMeters); // Calculate BMI
        }
    }

    public static String[] determineBMIStatus(double[][] personData) {
        String[] status = new String[personData.length];
        for (int i = 0; i < personData.length; i++) {
            double bmi = personData[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi >= 18.5 && bmi < 24.9) {
                status[i] = "Normal";
            } else if (bmi >= 25.0 && bmi < 30.0) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
}
