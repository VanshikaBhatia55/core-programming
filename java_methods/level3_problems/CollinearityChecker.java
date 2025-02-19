package core_programming.java_methods.level3_problems;
import java.util.Scanner;

public class CollinearityChecker {
    // Method to check collinearity using slopes
    public static boolean checkCollinearityBySlopes(double x1, double y1,
                                                    double x2, double y2,
                                                    double x3, double y3) {
        // Handle vertical lines first
        if (x1 == x2 && x2 == x3) {
            return true;
        }

        // Calculate slopes
        double slopeAB = (x2 - x1 != 0) ? (y2 - y1) / (x2 - x1) : Double.POSITIVE_INFINITY;
        double slopeBC = (x3 - x2 != 0) ? (y3 - y2) / (x3 - x2) : Double.POSITIVE_INFINITY;
        double slopeAC = (x3 - x1 != 0) ? (y3 - y1) / (x3 - x1) : Double.POSITIVE_INFINITY;

        // Compare slopes with small epsilon for floating-point comparison
        double epsilon = 0.0000001;
        return Math.abs(slopeAB - slopeBC) < epsilon &&
                Math.abs(slopeBC - slopeAC) < epsilon;
    }

    // Method to check collinearity using area
    public static boolean checkCollinearityByArea(double x1, double y1,
                                                  double x2, double y2,
                                                  double x3, double y3) {
        // Calculate area using the formula
        double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));

        // Points are collinear if area is zero (using small epsilon for floating-point comparison)
        return Math.abs(area) < 0.0000001;
    }

    // Method to print point coordinates
    private static void printPoint(String label, double x, double y) {
        System.out.printf("%s(%.1f, %.1f)", label, x, y);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            // Get input for point A
            System.out.println("Enter coordinates for point A:");
            System.out.print("x1: ");
            double x1 = scanner.nextDouble();
            System.out.print("y1: ");
            double y1 = scanner.nextDouble();

            // Get input for point B
            System.out.println("\nEnter coordinates for point B:");
            System.out.print("x2: ");
            double x2 = scanner.nextDouble();
            System.out.print("y2: ");
            double y2 = scanner.nextDouble();

            // Get input for point C
            System.out.println("\nEnter coordinates for point C:");
            System.out.print("x3: ");
            double x3 = scanner.nextDouble();
            System.out.print("y3: ");
            double y3 = scanner.nextDouble();

            // Print entered points
            System.out.println("\nChecking collinearity for points:");
            printPoint("A", x1, y1);
            System.out.print(", ");
            printPoint("B", x2, y2);
            System.out.print(", ");
            printPoint("C", x3, y3);
            System.out.println("\n");

            // Check collinearity using slopes
            boolean collinearBySlopes = checkCollinearityBySlopes(x1, y1, x2, y2, x3, y3);
            System.out.println("Using Slope Method:");
            if (collinearBySlopes) {
                System.out.println("The points are collinear.");

                // Calculate and display the slope (if not vertical line)
                if (x2 - x1 != 0) {
                    double slope = (y2 - y1) / (x2 - x1);
                    System.out.printf("The slope of the line is: %.2f%n", slope);
                } else {
                    System.out.println("The line is vertical (undefined slope)");
                }
            } else {
                System.out.println("The points are not collinear.");
            }

            // Check collinearity using area
            boolean collinearByArea = checkCollinearityByArea(x1, y1, x2, y2, x3, y3);
            System.out.println("\nUsing Area Method:");
            if (collinearByArea) {
                System.out.println("The points are collinear (area = 0).");
            } else {
                double area = 0.5 * (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
                System.out.printf("The points are not collinear (area = %.2f).%n", Math.abs(area));
            }

            // Verify both methods agree
            if (collinearBySlopes != collinearByArea) {
                System.out.println("\nWARNING: Methods produced different results!");
            }

            // Additional verification for collinear points
            if (collinearBySlopes) {
                System.out.println("\nVerification:");
                if (x2 - x1 != 0 && x3 - x2 != 0 && x3 - x1 != 0) {
                    System.out.printf("Slope AB = %.2f%n", (y2 - y1) / (x2 - x1));
                    System.out.printf("Slope BC = %.2f%n", (y3 - y2) / (x3 - x2));
                    System.out.printf("Slope AC = %.2f%n", (y3 - y1) / (x3 - x1));
                } else {
                    System.out.println("Points form a vertical line (slopes are undefined)");
                }
            }
    }
}