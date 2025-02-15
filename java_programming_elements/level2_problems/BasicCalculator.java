package core_programming.java_programming_elements.level2_problems;

import java.util.Scanner;

public class BasicCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float number1 = scanner.nextFloat();
        float number2 = scanner.nextFloat();

        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;
        float division = number1 / number2;

        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "+ number1 +" and "+ number2 + " is "+ addition +", " +  subtraction +", " + multiplication +" and " + division);

    }
}
