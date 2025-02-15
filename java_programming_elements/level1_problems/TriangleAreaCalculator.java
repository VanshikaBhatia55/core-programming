package core_programming.java_programming_elements.level1_problems;

import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double baseInInches = input.nextDouble();
        double heightInInches = input.nextDouble();

        double heightInfeet = heightInInches * 0.833333;
        double heightInCentimeters = heightInInches * 2.54;

        double areaInSquareInches = 0.5 * baseInInches * heightInInches;
        double areaInSquareCentimeters = areaInSquareInches * 2.54;

        System.out.println("The area of the triangle is " + areaInSquareInches+ "square inches and " + areaInSquareCentimeters + "square centimeters");
        System.out.println("Height in cm is " + heightInCentimeters + "cm while in feet is " + heightInfeet +"feet and inches is " + heightInInches + "inches .");
        }
}
