package core_programming.arrays_practices.level2_problems;

import java.util.Scanner;

public class LargestAndSecondLargest2 {
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
            if(index == maxDigit){
                maxDigit *= 2;
                int[] newArr = new int[maxDigit];
                System.arraycopy(DigitStore,0,newArr,0,DigitStore.length);
                DigitStore = newArr;

            }
            int last = (int)number % 10;
            DigitStore[index] = last;

            if(DigitStore[index] > largest){
                secondLargest = largest;
                largest = DigitStore[index];
            }

            number /= 10;
            index++;

        }

        System.out.println("Largest digit in the number : " + largest);
        System.out.println("Second largest digit in the number : " + secondLargest);
    }
}
