package core_programming.java_methods.level3_problems;

import java.util.Scanner;

public class CalendarGenerator {
    private static final String[] MONTHS = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
    };

    private static final int[] DAYS_IN_MONTH = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    // Method to get month name
    public static String getMonthName(int month) {
        return MONTHS[month - 1];
    }

    // Method to check if year is leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to get number of days in a month
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return DAYS_IN_MONTH[month - 1];
    }

    // Method to get the first day of the month (0 = Sunday, 1 = Monday, etc.)
    public static int getFirstDayOfMonth(int month, int year) {
        // Adjust month and year for Gregorian calendar algorithm
        if (month < 3) {
            month += 12;
            year--;
        }

        int y0 = year - (14 - month) / 12;
        int x = y0 + y0/4 - y0/100 + y0/400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        // Calculate for 1st of the month, so d = 1
        return (1 + x + (31 * m0) / 12) % 7;
    }

    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        // Display header
        System.out.println("\n      " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Get first day of the month and number of days
        int firstDay = getFirstDayOfMonth(month, year);
        int daysInMonth = getDaysInMonth(month, year);

        // Print initial spaces
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print days
        for (int day = 1; day <= daysInMonth; day++) {
            System.out.printf("%3d ", day);

            // Move to next line after Saturday
            if ((day + firstDay) % 7 == 0) {
                System.out.println();
            }
        }

        // Print final newline if needed
        if ((daysInMonth + firstDay) % 7 != 0) {
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get input from user
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt();

        System.out.print("Enter year: ");
        int year = scanner.nextInt();

        // Validate input
        if (month < 1 || month > 12) {
            System.out.println("Invalid month. Month should be between 1 and 12.");
            return;
        }

        if (year < 1) {
            System.out.println("Invalid year. Year should be positive.");
            return;
        }

        // Display the calendar
        displayCalendar(month, year);

        scanner.close();
    }
}
