package core_programming.java_methods.level3_problems;

import java.util.Scanner;

public class StudentScorecard {
    // Constants for subject maximum marks
    private static final int MAX_MARKS = 100;
    private static final int MIN_SCORE = 10; // Minimum random score

    // Method to generate random scores for all students
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // 3 subjects: Physics, Chemistry, Math

        for (int i = 0; i < numStudents; i++) {
            // Generate random 2-digit scores (10-99)
            scores[i][0] = MIN_SCORE + (int)(Math.random() * (90)); // Physics
            scores[i][1] = MIN_SCORE + (int)(Math.random() * (90)); // Chemistry
            scores[i][2] = MIN_SCORE + (int)(Math.random() * (90)); // Math
        }

        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateMetrics(int[][] scores) {
        double[][] metrics = new double[scores.length][3]; // [total, average, percentage]

        for (int i = 0; i < scores.length; i++) {
            // Calculate total
            double total = scores[i][0] + scores[i][1] + scores[i][2];

            // Calculate average
            double average = total / 3.0;

            // Calculate percentage
            double percentage = (total / (3 * MAX_MARKS)) * 100;

            // Round off to 2 decimal places
            metrics[i][0] = Math.round(total * 100.0) / 100.0;
            metrics[i][1] = Math.round(average * 100.0) / 100.0;
            metrics[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return metrics;
    }

    // Method to display scorecard
    public static void displayScorecard(int[][] scores, double[][] metrics) {
        // Print header
        System.out.println("\nSTUDENT SCORECARD");
        System.out.println("=".repeat(80));
        System.out.println("Roll No\tPhysics\tChem\tMath\tTotal\tAverage\tPercentage");
        System.out.println("-".repeat(80));

        // Print each student's data
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t%d\t%.2f\t%.2f\t%.2f%%\n",
                    (i + 1),            // Roll number
                    scores[i][0],       // Physics
                    scores[i][1],       // Chemistry
                    scores[i][2],       // Math
                    metrics[i][0],      // Total
                    metrics[i][1],      // Average
                    metrics[i][2]);     // Percentage
        }
        System.out.println("=".repeat(80));

        // Calculate and display class statistics
        double classAvgPhysics = 0, classAvgChem = 0, classAvgMath = 0;
        for (int[] score : scores) {
            classAvgPhysics += score[0];
            classAvgChem += score[1];
            classAvgMath += score[2];
        }

        int numStudents = scores.length;
        classAvgPhysics = Math.round((classAvgPhysics / numStudents) * 100.0) / 100.0;
        classAvgChem = Math.round((classAvgChem / numStudents) * 100.0) / 100.0;
        classAvgMath = Math.round((classAvgMath / numStudents) * 100.0) / 100.0;

        System.out.println("\nCLASS STATISTICS");
        System.out.println("-".repeat(80));
        System.out.printf("Class Averages: Physics: %.2f, Chemistry: %.2f, Mathematics: %.2f\n",
                classAvgPhysics, classAvgChem, classAvgMath);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            // Get number of students
            System.out.print("Enter the number of students: ");
            int numStudents = scanner.nextInt();

            // Validate input
            if (numStudents <= 0) {
                System.out.println("Please enter a positive number of students.");
                return;
            }

            // Generate scores
            int[][] scores = generateScores(numStudents);

            // Calculate metrics
            double[][] metrics = calculateMetrics(scores);

            // Display scorecard
            displayScorecard(scores, metrics);

    }
}
