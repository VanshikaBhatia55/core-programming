package core_programming.control_flow.level1_problems;

import java.util.Scanner;

public class DivisibilityCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        boolean isDivisible = (number % 5 == 0);

        System.out.println("Is the number " + number + " divisible by 5?  -> " + isDivisible);
    }
}
