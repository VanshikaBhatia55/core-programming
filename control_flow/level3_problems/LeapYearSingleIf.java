package core_programming.control_flow.level3_problems;

import java.util.Scanner;

public class LeapYearSingleIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        if(year >= 1582 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))){
            System.out.println(year + " is a Leap Year.");
        }else if (year < 1582) {
            System.out.println("Year must be 1582 or later.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }
    }
}
