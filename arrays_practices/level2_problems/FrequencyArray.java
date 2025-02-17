package core_programming.arrays_practices.level2_problems;

import java.util.Scanner;

public class FrequencyArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        long number = input.nextLong();

        int[] frequencyArray = new int[10];

            for (int i = 0; i <= 9; i++) {
                while(number > 0) {
                int last = (int) number % 10;
                frequencyArray[last]++;
                number /= 10;
            }
        }

        for (int i = 0; i < frequencyArray.length; i++) {
            if(frequencyArray[i] > 0){
                System.out.println("Frequency of " + i + " : " + frequencyArray[i]);
            }
        }
    }
}
