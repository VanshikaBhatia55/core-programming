package core_programming.control_flow.level3_problems;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check if it's prime: ");
        int primeNumber = input.nextInt();
        boolean isPrime = true;

        if (primeNumber <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= Math.sqrt(primeNumber); i++) {
                if (primeNumber % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        System.out.println(primeNumber + " is " + (isPrime ? "a prime number." : "not a prime number."));



    }
}
