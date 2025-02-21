package core_programming.extras.built_in_function.level1_problems;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatting {
    public static void displayFormattedDates() {
        LocalDate currentDate = LocalDate.now();

        // Format 1: dd/MM/yyyy
        DateTimeFormatter formatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Format 1: " + currentDate.format(formatter1));

        // Format 2: yyyy-MM-dd
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println("Format 2: " + currentDate.format(formatter2));

        // Format 3: EEE, MMM dd, yyyy
        DateTimeFormatter formatter3 = DateTimeFormatter.ofPattern("EEE, MMM dd, yyyy");
        System.out.println("Format 3: " + currentDate.format(formatter3));
    }

    public static void main(String[] args) {
        System.out.println("Current date in different formats:");
        displayFormattedDates();
    }
}
