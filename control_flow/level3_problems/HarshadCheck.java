package core_programming.control_flow.level3_problems;

import java.util.Scanner;

public class HarshadCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to check if it's a Harshad number: ");
        int harshadNumber = scanner.nextInt();
        int sumOfDigits = 0;
        int temp = harshadNumber;

        while (temp != 0) {
            sumOfDigits += temp % 10;
            temp /= 10;
        }
        System.out.println(harshadNumber + " is " + (harshadNumber % sumOfDigits == 0 ? "a Harshad number." : "not a Harshad number."));

    }
}
