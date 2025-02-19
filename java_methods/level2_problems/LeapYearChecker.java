package core_programming.java_methods.level2_problems;

import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();

        if (year < 1582) {
            System.out.println("Year must be 1582 or later, as it corresponds to the Gregorian calendar.");
        } else {
            if (isLeapYear(year)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
        }

    }

    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
        // 1. It is divisible by 4
        // 2. It is not divisible by 100, unless it is also divisible by 400
    }
}
