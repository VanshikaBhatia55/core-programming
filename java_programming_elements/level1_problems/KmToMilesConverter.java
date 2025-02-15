package core_programming.java_programming_elements.level1_problems;

import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double km = input.nextDouble();
        double miles = km / 1.6;

        System.out.println("The total miles is " + miles +"mile for the given "+ km +"km");
    }
}
