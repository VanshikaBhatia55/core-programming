package core_programming.java_methods.level1_problems;

import java.util.Scanner;

public class ChocolateDistribution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Total chocolates : ");
        int numberOfchocolates = input.nextInt();
        System.out.print("Total Children : ");
        int numberOfChildren = input.nextInt();

        int[] result = findRemainderAndQuotient(numberOfchocolates,numberOfChildren);
        System.out.println("Number of choclates each child will get : " + result[1]);
        System.out.println("Remaining choclates will be " + result[0]);
    }
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int quotient = 0; // Initialize quotient
        int remainder = 0; // Initialize remainder

        // Check if divisor is not zero to avoid division by zero
        if (divisor != 0) {
            quotient = number / divisor; // Calculate the number of chocolates each child gets
            remainder = number % divisor; // Calculate the remaining chocolates
        } else {
            System.out.println("Number of children cannot be zero.");
        }


        return new int[]{remainder,quotient};
    }
}
