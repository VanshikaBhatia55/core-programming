package core_programming.control_flow.level1_problems;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number >= 0) {
            int sum = number * (number + 1) / 2;
            System.out.printf("The sum of " + number + " natural numbers is " + sum);
        } else {
            System.out.printf("The number " + number + "is not a natural number");
        }
    }
}
