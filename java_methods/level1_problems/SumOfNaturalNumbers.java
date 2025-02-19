package core_programming.java_methods.level1_problems;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n =0;

        while(true){
            System.out.print("Enter the number : ");
            n = input.nextInt();
            if(n < 1){
                System.out.println("Enter a positive number.");
                continue;
            }
            break;
        }

        int result = Sum(n);
        System.out.println("Sum of " + n + " natural numbers : "+ result);


    }

    public static int Sum(int n){
        int sum = 0;
        for (int i = 1 ; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
