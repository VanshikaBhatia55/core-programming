package core_programming.java_methods.level1_problems;

import java.util.Scanner;

public class QuotientAndRemainder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of number : ");
        int number = input.nextInt();
        System.out.print("Enter the value of divisor : ");
        int divisor = input.nextInt();

        int[] result = findRemainderAndQuotient(number,divisor);
        System.out.println("Remainder for number "+ number + " with divisor as " + divisor + " will be " + result[0]);
        System.out.println("Quotient for number "+ number + " with divisor as " + divisor + " will be " + result[1]);
    }
    public static int[] findRemainderAndQuotient(int number, int divisor){
        int remainder = number % divisor;
        int quotient = number / divisor;

        return new int[]{remainder,quotient};
    }
}
