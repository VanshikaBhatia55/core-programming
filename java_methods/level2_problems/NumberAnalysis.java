package core_programming.java_methods.level2_problems;

import java.util.Scanner;

public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] numbers = new int[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter numbers " + (i+1) + " : ");
            numbers[i] = input.nextInt();
        }
        System.out.println();

        for (int number : numbers){
            if(isPositive(number)){
                System.out.print(number + " is positive number");
                if(isEven(number)){
                    System.out.println(",and an even number.");
                }else{
                    System.out.println(",and a odd number.");
                }
            }else{
                System.out.println(number + " is negative number.");
            }
        }
        System.out.println();

        int comparisonResult = compare(numbers[0], numbers[numbers.length - 1]);
        if (comparisonResult > 0) {
            System.out.println("The first element is greater than the last element.");
        } else if (comparisonResult < 0) {
            System.out.println("The first element is less than the last element.");
        } else {
            System.out.println("The first element is equal to the last element.");
        }

    }

    public static boolean isPositive(int number){
        return number >= 0;
    }

    public static boolean isEven(int number){
        return number % 2 == 0;
    }

    public static int compare(int number1, int number2){
        if(number1 > number2){
            return 1;
        }else if(number1 < number2){
            return -1;
        }else{
            return 0;
        }
    }
}
