package core_programming.control_flow.level2_problems;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number +" * " + i + " = " + number * i);
        }
    }
}
