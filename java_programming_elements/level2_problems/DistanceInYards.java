package core_programming.java_programming_elements.level2_problems;

import java.util.Scanner;

public class DistanceInYards {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double distanceInFeet = input.nextDouble();

        double distanceInYard = distanceInFeet / 3;
        double distanceInMiles = distanceInYard / 1760;

        System.out.println("The distance in yards is " + distanceInYard + " and in miles is " + distanceInMiles);
    }
}
