package core_programming.java_methods.level1_problems;

import java.util.Scanner;

public class TrigonometricFunctions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter angle in degrees : ");
        double angle = input.nextDouble();

        double[] result = calculateTrigonometricFunctions(angle);
        System.out.printf("Sine of %.2f degrees: %.2f%n", angle, result[0]);
        System.out.printf("Cosine of %.2f degrees: %.2f%n", angle, result[1]);
        System.out.printf("Tangent of %.2f degrees: %.2f%n", angle, result[2]);

    }
    public static double[] calculateTrigonometricFunctions(double angle){
        double radians = Math.toRadians(angle);
        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine,cosine,tangent};
    }
}
