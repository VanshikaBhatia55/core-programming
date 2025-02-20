package core_programming.string.level2_problems;
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of students:");
        int numStudents = scanner.nextInt();

        // Generate random scores for students
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, and percentage
        double[][] results = calculateResults(scores);

        // Calculate grades based on percentage
        String[] grades = calculateGrades(results);

        // Display the scorecard
        displayScorecard(scores, results, grades);

        scanner.close();
    }

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math
    public static int[][] generateScores(int numStudents) {
        int[][] scores = new int[numStudents][3]; // [student][physics, chemistry, math]
        for (int i = 0; i < numStudents; i++) {
            for (int j = 0; j < 3; j++) {
                scores[i][j] = 10 + (int)(Math.random() * 90); // Scores between 10 and 99
            }
        }
        return scores;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateResults(int[][] scores) {
        double[][] results = new double[scores.length][4]; // [student][total, average, percentage]
        for (int i = 0; i < scores.length; i++) {
            results[i][0] = scores[i][0] + scores[i][1] + scores[i][2]; // total
            results[i][1] = Math.round((results[i][0] / 3.0) * 100.0) / 100.0; // average
            results[i][2] = Math.round((results[i][0] / 300.0) * 100.0); // percentage
        }
        return results;
    }

    // Method to calculate grades based on percentage
    public static String[] calculateGrades(double[][] results) {
        String[] grades = new String[results.length];
        for (int i = 0; i < results.length; i++) {
            double percentage = results[i][2];
            if (percentage >= 90) {
                grades[i] = "A";
            } else if (percentage >= 80) {
                grades[i] = "B";
            } else if (percentage >= 70) {
                grades[i] = "C";
            } else if (percentage >= 60) {
                grades[i] = "D";
            } else {
                grades[i] = "F";
            }
        }
        return grades;
    }

    // Method to display the scorecard
    public static void displayScorecard(int[][] scores, double[][] results, String[] grades) {
        System.out.println("\nScorecard:");
        System.out.println("-----------------------------------------------------");
        System.out.println("Student\tPhysics\tChemistry\tMath\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("-----------------------------------------------------");
        for (int i = 0; i < scores.length; i++) {
            System.out.printf("%d\t%d\t%d\t\t%d\t%.2f\t%.2f\t\t%s\n",
                    i + 1, scores[i][0], scores[i][1], scores[i][2],
                    results[i][0], results[i][1], results[i][2], grades[i]);
        }
    }
}