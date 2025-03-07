package core_programming.control_flow.level1_problems;

import java.util.Scanner;

public class SumOfNaturalNumbersWHILE {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int number = input.nextInt();

        if(number > 0){
            int formulaSum = number * (number + 1) / 2;

            int loopSum = 0;
            int i = 1;
            while(i<= number){
                loopSum += i;
                i++;
            }

            System.out.println("Formula Sum : " + formulaSum);
            System.out.println("Loop Sum : " + loopSum);

            if (formulaSum == loopSum) {
                System.out.println("Both are correct.");
            } else {
                System.out.println("There is a discrepancy.");
            }
        }
        else{
            System.out.println("The number " + number +" is not a natural number.");
        }
    }
}
