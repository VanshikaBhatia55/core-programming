package core_programming.control_flow.level1_problems;

import java.util.Scanner;

public class CountdownFor {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();

        for (int  i = counter; i >= 1 ; i--) {
            System.out.println("Value of counter -> " + i);
        }

    }
}
