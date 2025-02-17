package core_programming.arrays_practices.level2_problems;

import java.util.Scanner;

public class LargestAndSecondLargest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        long number = input.nextLong();
        int maxDigit = 10;

        int[] DigitStore = new int[maxDigit];
        int index = 0;
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        while(number > 0){
            int last = (int)number % 10;
            DigitStore[index] = last;
            if(DigitStore[index] > largest){
                secondLargest = largest;
                largest = DigitStore[index];
            }
            number /= 10;
        }

        System.out.println("Largest digit in the number : " + largest);
        System.out.println("Second largest digit in the number : " + secondLargest);

    }
}
