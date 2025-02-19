package core_programming.java_methods.level3_problems;

import java.util.Scanner;

public class heightCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] heightInCM = new int[11];

        for (int i = 0; i < 11; i++) {
            while(true){
            System.out.print("Height of player " + (i+1) + " in cms (150 -250) : ");
            heightInCM[i] = input.nextInt();

               if(heightInCM[i] < 150 || heightInCM[i] > 250 ){
                   System.out.println("Enter height between 150cms - 250cms.");
                   continue;
               }
               break;
            }
        }
        System.out.println();

        long sum = findSum(heightInCM);
        double mean = findMean(heightInCM);
        int shortest = findShortest(heightInCM);
        int tallest = findTallest(heightInCM);

        System.out.println("Total height of players: " + sum + " cms");
        System.out.printf("Mean height of players: %.2f cms%n", mean);
        System.out.println("Shortest height of players: " + shortest + " cms");
        System.out.println("Tallest height of players: " + tallest + " cms");
    }

    public static long findSum(int[] arr){
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static double findMean(int[] arr){
        long sum = findSum(arr);
        return (double) sum / arr.length;
    }

    public static int findShortest(int[] arr) {
        int minHeight = arr[0]; // Assume the first height is the shortest
        for (int height : arr) {
            if (height < minHeight) {
                minHeight = height;
            }
        }
        return minHeight;
    }

    public static int findTallest(int[] arr) {
        int maxHeight = arr[0]; // Assume the first height is the tallest
        for (int height : arr) {
            if (height > maxHeight) {
                maxHeight = height;
            }
        }
        return maxHeight;
    }
}
