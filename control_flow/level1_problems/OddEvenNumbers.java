package core_programming.control_flow.level1_problems;

import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int last = input.nextInt();

        for (int i = 1; i <= last ; i++) {
            if(i % 2 == 0) System.out.println("Even numbers -> " + i);
            else System.out.println("Odd numbers -> " + i);
        }
    }
}
