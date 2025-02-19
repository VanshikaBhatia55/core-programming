package core_programming.java_methods.level3_problems;

import java.util.Scanner;

public class LineCalculator {
    // Method to calculate Euclidean distance between two points
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double xDiff = x2 - x1;
        double yDiff = y2 - y1;

        // Using Math.pow() for squares and Math.sqrt() for square root
        return Math.sqrt(Math.pow(xDiff, 2) + Math.pow(yDiff, 2));
    }

    // Method to calculate line equation parameters (slope and y-intercept)
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] equation = new double[2];

        // Calculate slope (m)
        double slope = (y2 - y1) / (x2 - x1);
        equation[0] = slope;

        // Calculate y-intercept (b)
        double yIntercept = y1 - (slope * x1);
        equation[1] = yIntercept;

        return equation;
    }

    // Method to format line equation as a string
    public static String formatLineEquation(double slope, double yIntercept) {
        StringBuilder equation = new StringBuilder("y = ");

        // Format slope part
        if (slope == 1) {
            equation.append("x");
        } else if (slope == -1) {
            equation.append("-x");
        } else {
            equation.append(String.format("%.2fx", slope));
        }

        // Format y-intercept part
        if (yIntercept > 0) {
            equation.append(" + ").append(String.format("%.2f", yIntercept));
        } else if (yIntercept < 0) {
            equation.append(" - ").append(String.format("%.2f", Math.abs(yIntercept)));
        }

        return equation.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input for first point
        System.out.println("Enter coordinates for first point:");
        System.out.print("x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("y1: ");
        double y1 = scanner.nextDouble();

        // Get input for second point
        System.out.println("\nEnter coordinates for second point:");
        System.out.print("x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("y2: ");
        double y2 = scanner.nextDouble();

        // Check if points are the same
        if (x1 == x2 && y1 == y2) {
            System.out.println("\nError: The points are identical. Cannot form a line.");
            scanner.close();
            return;
        }

        // Check for vertical line
        if (x1 == x2) {
            System.out.println("\nThis is a vertical line: x = " + x1);
            System.out.printf("Distance between points: %.2f units%n",
                    calculateDistance(x1, y1, x2, y2));
            scanner.close();
            return;
        }

        // Calculate and display results
        double distance = calculateDistance(x1, y1, x2, y2);
        double[] lineParams = calculateLineEquation(x1, y1, x2, y2);
        String lineEquation = formatLineEquation(lineParams[0], lineParams[1]);

        // Display results
        System.out.println("\nResults:");
        System.out.printf("Distance between points: %.2f units%n", distance);
        System.out.println("Line equation: " + lineEquation);
        System.out.printf("Slope (m): %.2f%n", lineParams[0]);
        System.out.printf("Y-intercept (b): %.2f%n", lineParams[1]);

        scanner.close();
    }
}
