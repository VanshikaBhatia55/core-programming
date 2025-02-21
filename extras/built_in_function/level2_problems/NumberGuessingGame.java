package core_programming.extras.built_in_function.level2_problems;

import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    private static final int MIN = 1;
    private static final int MAX = 100;
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    private static int generateGuess(int low, int high) {
        return low + (high - low) / 2;
    }

    private static String getUserFeedback() {
        System.out.print("Is the number high (H), low (L), or correct (C)? ");
        return scanner.nextLine().toUpperCase();
    }

    private static void playGame() {
        System.out.println("Think of a number between " + MIN + " and " + MAX);
        int low = MIN, high = MAX;
        int attempts = 0;

        while (true) {
            int guess = generateGuess(low, high);
            attempts++;
            System.out.println("Computer's guess: " + guess);

            String feedback = getUserFeedback();
            if (feedback.equals("C")) {
                System.out.println("Computer found the number in " + attempts + " attempts!");
                break;
            } else if (feedback.equals("H")) {
                high = guess - 1;
            } else if (feedback.equals("L")) {
                low = guess + 1;
            }

            if (low > high) {
                System.out.println("Invalid feedback provided!");
                break;
            }
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Number Guessing Game!");
        playGame();
        scanner.close();
    }
}
