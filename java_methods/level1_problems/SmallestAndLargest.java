package core_programming.java_methods.level1_problems;

import java.util.Scanner;

public class SmallestAndLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number 1 : ");
        int number1 = input.nextInt();
        System.out.print("Enter number 2 : ");
        int number2 = input.nextInt();
        System.out.print("Enter number 3 : ");
        int number3 = input.nextInt();

        int[] result = findSmallestAndLargest(number1,number2,number3);
        for (int i = 0; i < 2; i++) {
            if(i == 0) {
                System.out.println("Smallest number : " + result[i]);
            }else{
                System.out.println("Largest number : " + result[i]);
            }
        }


    }

    public static int[] findSmallestAndLargest(int number1, int number2, int number3){
        int[] result = new int[2];
        int Smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;

        if(number1<number2 && number1<number3){
            Smallest = number1;
            if(number3 > number2){
                largest = number3;
            }else {
                largest = number2;
            }
        }else if(number2<number1 && number2<number3){
            Smallest = number2;
            if(number3 > number1){
                largest = number3;
            }else {
                largest = number1;
            }
        }else{
            Smallest = number3;
            if(number2 > number1){
                largest = number2;
            }else {
                largest = number1;
            }
        }

        result[0] = Smallest;
        result[1] = largest;

        return result;
    }
}

