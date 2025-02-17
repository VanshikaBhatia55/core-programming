package core_programming.arrays_practices.level2_problems;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt();
        int originalNumber = number;
        int count = 0;

//        count of digits in the number
        while(number > 0){
            count++;
            number /= 10;
        }

//        array to store the digits
        int[] digits = new int[count];
        int index = 0;

//        stored the elements of the number in reverse order
        while(originalNumber > 0){
            int last = originalNumber % 10;
            digits[index++] = last;
            originalNumber /= 10;
        }

//        Finally, displayed the elements of the array in reverse order
        System.out.print("Reversed digits : ");
        for(int reversedDigit : digits){
            System.out.print(reversedDigit + " ");
        }

    }
}
