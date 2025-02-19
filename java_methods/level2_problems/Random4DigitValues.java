package core_programming.java_methods.level2_problems;

import java.util.Arrays;

public class Random4DigitValues {
    public static void main(String[] args) {
        // Generate an array of 5 random 4-digit numbers
        int[] randomNumbers = generate4DigitRandomArray(5);

        double[] results = findAverageMinMax(randomNumbers);

        // Display the results
        System.out.println("Generated 4-digit random numbers: " + Arrays.toString(randomNumbers));
        System.out.printf("Average: %.2f%n", results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
    }

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] randomArray = new int[size];
        for (int i = 0; i < size; i++) {

//            Math.random() generates a double value between
//            0.0 (inclusive) and 1.0 (exclusive).Generated between (1000 to 9999)
            randomArray[i] = (int) (Math.random() * 9000) + 1000;
        }
        return randomArray;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        double sum = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int number : numbers) {
            sum += number; // Calculate sum
            min = (int) Math.min(min, number); // Find minimum
            max = (int) Math.max(max, number); // Find maximum
        }

        double average = sum / numbers.length; // Calculate average
        return new double[]{average, min, max}; // Return average, min, and max
    }
}
