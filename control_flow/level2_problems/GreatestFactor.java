package core_programming.control_flow.level2_problems;

import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();
        int greatestFactor = 1;

        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break;
            }
        }

        System.out.printf("The greatest factor of " + number + " beside itself is " +  greatestFactor);
    }
}
