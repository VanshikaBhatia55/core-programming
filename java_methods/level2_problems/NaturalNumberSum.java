package core_programming.java_methods.level2_problems;

import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a natural number : ");
        int n = input.nextInt();

        if (n < 1) {
            System.out.println("Please enter a natural number greater than 0.");
            input.close();
            return;
            // Exit the program if the input is not a natural number
        }

        int recursiveSum = sumOfNaturalNumbers(n);
        int formulaSum = sumUsingFormula(n);

        System.out.println("Sum of first " + n + " natural numbers (using recursion): " + recursiveSum);
        System.out.println("Sum of first " + n + " natural numbers (using formula): " + formulaSum);

        if(recursiveSum == formulaSum){
            System.out.println("Both methods give the same result.");
        }else{
            System.out.println("There is a discrepancy between the two methods.");
        }
    }
    public static int sumOfNaturalNumbers(int n){
        if(n == 1){
            return 1;
        }
        return n + sumOfNaturalNumbers(n-1);
    }

    public static int sumUsingFormula(int n) {
        return (n * (n + 1)) / 2; // Formula for the sum of the first n natural numbers
    }
}
