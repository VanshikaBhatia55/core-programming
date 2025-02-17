package core_programming.control_flow.level3_problems;

import java.util.Scanner;

public class AbundantCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Abundant number: ");
        int abundantNumber = scanner.nextInt();
        int divisorSum = 0;

        for (int i = 1; i < abundantNumber; i++) {
            if (abundantNumber % i == 0) {
                divisorSum += i;
            }
        }
        System.out.println(abundantNumber + " is " + (divisorSum > abundantNumber ? "an Abundant number." : "not an Abundant number."));

    }
}
