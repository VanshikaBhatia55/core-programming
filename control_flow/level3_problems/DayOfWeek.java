<<<<<<< HEAD
package core_programming.control_flow.level3_problems;public class DayOfWeek {
}
=======
package core_programming.control_flow.level3_problems;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter month (1-12): ");
        int m = scanner.nextInt();
        System.out.print("Enter day (1-31): ");
        int d = scanner.nextInt();
        System.out.print("Enter year: ");
        int y = scanner.nextInt();

        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + 31 * m0 / 12) % 7;

        System.out.println("The day of the week is: " + d0);
    }
}
>>>>>>> 51b98f09dba5f7f7c68b086afad4d4aaa9b344e5
