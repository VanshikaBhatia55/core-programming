package core_programming.string.level3_problems;

import java.util.Scanner;

public class BMICalculator {
    public static String[][] calculateBMIAndStatus(double[][] data) {
        String[][] result = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double height = data[i][1] / 100.0; // Convert cm to m
            double weight = data[i][0];
            double bmi = weight / (height * height);
            String status;

            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 25) {
                status = "Normal";
            } else if (bmi < 30) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.format("%.2f", height);
            result[i][1] = String.format("%.2f", weight);
            result[i][2] = String.format("%.2f", bmi);
            result[i][3] = status;
        }
        return result;
    }

    public static void displayResults(String[][] results) {
        System.out.println("\nPerson's Details:");
        System.out.printf("%-15s %-15s %-15s %-15s%n", "Height(m)", "Weight(kg)", "BMI", "Status");
        System.out.println("---------------------------------------------------------");
        for (String[] person : results) {
            System.out.printf("%-15s %-15s %-15s %-15s%n",
                    person[0], person[1], person[2], person[3]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2];

        System.out.println("Enter details for 10 people:");
        for (int i = 0; i < 10; i++) {
            System.out.printf("\nPerson %d:%n", i + 1);
            System.out.print("Enter weight (kg): ");
            data[i][0] = scanner.nextDouble();
            System.out.print("Enter height (cm): ");
            data[i][1] = scanner.nextDouble();
        }

        String[][] results = calculateBMIAndStatus(data);
        displayResults(results);
        scanner.close();
    }
}
