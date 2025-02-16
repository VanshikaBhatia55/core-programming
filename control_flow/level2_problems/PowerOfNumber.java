package core_programming.control_flow.level2_problems;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        int power = input.nextInt();
        int result = 1;

        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        System.out.printf(number + " raised to the power of " + power + " is " + result);
    }
}
