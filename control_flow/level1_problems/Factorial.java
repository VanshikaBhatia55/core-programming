package core_programming.control_flow.level1_problems;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int num = input.nextInt();
        if(num >= 0){
            int fact = 1;
            while(num > 1){
                fact *= num;
                num--;
            }

            System.out.println("Factorial of " + num +" -> " + fact);
        }
        else System.out.println("Factorial is not defined for negative numbers.");
    }
}
