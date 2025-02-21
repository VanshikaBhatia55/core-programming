package core_programming.extras.built_in_function.level1_problems;

import java.time.LocalDate;
import java.util.Scanner;

public class DateComparison {
    public static void compareDates(LocalDate date1, LocalDate date2) {
        System.out.println("First Date: " + date1);
        System.out.println("Second Date: " + date2);

        if (date1.isEqual(date2)) {
            System.out.println("Both dates are the same");
        } else if (date1.isBefore(date2)) {
            System.out.println("First date is before second date");
        } else {
            System.out.println("First date is after second date");
        }

        // Calculate days between dates
        long daysBetween = Math.abs(date1.toEpochDay() - date2.toEpochDay());
        System.out.println("Number of days between dates: " + daysBetween);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first date (yyyy-MM-dd):");
        String date1Str = scanner.nextLine();
        LocalDate date1 = LocalDate.parse(date1Str);

        System.out.println("Enter second date (yyyy-MM-dd):");
        String date2Str = scanner.nextLine();
        LocalDate date2 = LocalDate.parse(date2Str);

        compareDates(date1, date2);

        scanner.close();
    }
}
