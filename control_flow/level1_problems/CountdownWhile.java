package core_programming.control_flow.level1_problems;

import java.util.Scanner;

public class CountdownWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int counter = input.nextInt();

        while(counter >= 1){
            System.out.println("Value of counter -> " + counter);
            counter--;
        }
    }
}
