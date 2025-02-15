package core_programming.control_flow.level2_problems;

import java.util.Scanner;

public class EmployeeBonus {
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            int salary = input.nextInt();
            int serviceYears = input.nextInt();

            double bonus = 0.0;
            if (serviceYears > 5) {
                bonus = salary * 0.05;
            }

            System.out.println("The bonus amount is: " + bonus);
    }
}
