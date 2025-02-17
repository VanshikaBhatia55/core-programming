<<<<<<< HEAD
package core_programming.control_flow.level3_problems;public class DigitCount {
}
=======
package core_programming.control_flow.level3_problems;

import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to count its digits: ");
        int digitCountNumber = scanner.nextInt();
        int count = 0;

        while (digitCountNumber != 0) {
            digitCountNumber /= 10;
            count++;
        }
        System.out.println("The number of digits is: " + count);
    }
}
>>>>>>> 51b98f09dba5f7f7c68b086afad4d4aaa9b344e5
