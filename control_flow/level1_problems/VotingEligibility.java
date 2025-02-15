package core_programming.control_flow.level1_problems;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int age = input.nextInt();

        if (age >= 18) {
            System.out.printf("The person's age is " + age +" and can vote.");
        } else {
            System.out.printf("The person's age is " + age +" and cannot vote.");
        }
    }
}
