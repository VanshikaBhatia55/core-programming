package core_programming.java_methods.level1_problems;

import java.util.Scanner;

public class TriangularPark {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the length of side 1 (in meters): ");
        double side1 = input.nextDouble();
        System.out.print("Enter the length of side 2 (in meters): ");
        double side2 = input.nextDouble();
        System.out.print("Enter the length of side 3 (in meters): ");
        double side3 = input.nextDouble();

        double perimeter = side1 + side2 + side3;

        int distanceInKm = 5;

        double rounds = numberOfRound(perimeter , distanceInKm);
        System.out.printf("The athlete must complete %.2f rounds to run " +
                "5 km in the triangular park.%n", rounds);
    }

    public static double numberOfRound(double perimeter , int distanceInKm){
        return ((distanceInKm * 1000) / perimeter);
    }
}
