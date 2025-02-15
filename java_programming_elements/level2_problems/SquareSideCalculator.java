package core_programming.java_programming_elements.level2_problems;

import java.util.Scanner;

public class SquareSideCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double perimeter = input.nextDouble();
        double side = perimeter / 4;

        System.out.println("The length of the side is "+ side +" whose perimeter is "+ perimeter);

    }
}
