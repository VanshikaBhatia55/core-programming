package core_programming.java_methods.level1_problems;

import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int month = 0; // Declare month variable
        int day = 0;   // Declare day variable

        // Loop to get valid month and day input
        while (true) {
            System.out.print("Enter month: ");
            month = input.nextInt(); // Read the month input
            if (month < 1 || month > 12) { // Check for valid month range
                System.out.println("Enter a valid month (1-12).");
                continue; // Prompt again for valid input
            }
            break;
        }

        while(true){
            System.out.print("Enter day: ");
            day = input.nextInt(); // Read the day input
            if (day < 1 || day > 31) { // Check for valid day range
                System.out.println("Enter a valid day (1-31).");
                continue; // Prompt again for valid input
            }

            break; // Exit the loop if valid inputs are received
        }


        boolean result = springSeason(month,day);
        System.out.println("Is it spring season? " + result);

    }

    public static boolean springSeason(int month , int day){
        if((month ==3 && day>=20) || (month == 6 && day <= 20) || (month > 3 && month < 6)){
            return true;
        }

        return false;
    }
}
