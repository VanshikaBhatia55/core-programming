package core_programming.java_programming_elements.level1_problems;

import java.util.Scanner;

public class StudentFeeCalculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double fee = input.nextDouble();
        double discountPercent = input.nextDouble();

        double discount = (discountPercent / 100) * fee;
        double finalFee = fee - discount;

        System.out.println("The discount amount is INR "+ discount + " and final discounted fee is INR "+ finalFee);
    }
}
