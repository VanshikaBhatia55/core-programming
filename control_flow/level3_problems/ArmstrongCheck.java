package core_programming.control_flow.level3_problems;

import java.util.Scanner;

public class ArmstrongCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int armstrongNumber = input.nextInt();
        int originalNumber = armstrongNumber;
        int sum = 0;

        while (originalNumber != 0) {
            int digit = originalNumber % 10;
            sum += digit * digit * digit; // Cube of the digit
            originalNumber /= 10;
        }
        System.out.println(armstrongNumber + " is " + (sum == armstrongNumber ? "an Armstrong number." : "not an Armstrong number."));
    }
}
