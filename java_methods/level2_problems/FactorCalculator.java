package core_programming.java_methods.level2_problems;

import java.util.Scanner;

public class FactorCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();
        
        int[] factors = findFactors(number);

        int sum = findSum(factors);
        long product = findProduct(factors);
        double sumOfSquares = findSumOfSquares(factors);

        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
    }
    
    public static int[] findFactors(int number){
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if(number % i == 0){
                count++;
            }
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <=number ; i++) {
            if(number % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    public static int findSum(int[] factors){
        int sum = 0;
        for(int factor : factors){
            sum+=factor;
        }

        return sum;
    }

    public static long findProduct(int[] factors){
        long product = 1;
        for(int factor : factors){
            product *= factor;
        }
        return product;
    }

    public static double findSumOfSquares(int[] factors){
        double sumOfSquares = 0;
        for(int factor : factors){
            sumOfSquares += Math.pow(factor,2);
        }
        return sumOfSquares;
    }
}
