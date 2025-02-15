package core_programming.control_flow.level2_problems;

import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        if (number < 1) {
            System.out.println("Please enter a natural number greater than 0.");
        } else {
            for (int i = 1; i <= number ; i++) {
                if(i % 2 == 0) System.out.println("Even numbers -> " + i);
                else System.out.println("Odd numbers -> " + i);
            }
        }
    }
}
