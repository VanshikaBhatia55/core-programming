package core_programming.control_flow.level3_problems;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to count its digits: ");
        int digitCountNumber = scanner.nextInt();
        int count = 0;

        while (digitCountNumber != 0) {
            digitCountNumber /= 10;
            count++;
        }
        System.out.println("The number of digits is: " + count);
    }
}
