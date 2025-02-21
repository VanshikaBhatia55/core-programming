package core_programming.extras.built_in_function.level1_problems;

import java.time.LocalDate;
import java.util.Scanner;

public class DateArithmetic {
    public static void performDateCalculations(LocalDate inputDate) {
        System.out.println("Original Date: " + inputDate);

        // Add 7 days, 1 month, and 2 years
        LocalDate result = inputDate
                .plusDays(7)
                .plusMonths(1)
                .plusYears(2);
        System.out.println("After adding 7 days, 1 month, 2 years: " + result);

        // Subtract 3 weeks
        result = result.minusWeeks(3);
        System.out.println("After subtracting 3 weeks: " + result);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter date (yyyy-MM-dd):");
        String dateStr = scanner.nextLine();

        LocalDate inputDate = LocalDate.parse(dateStr);
        performDateCalculations(inputDate);

        scanner.close();
    }
}
