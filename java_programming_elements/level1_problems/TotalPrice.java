package core_programming.java_programming_elements.level1_problems;

import java.util.Scanner;

public class TotalPrice {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double unitPrice = input.nextDouble();
        double quantity = input.nextDouble();

        double totalPurchasePrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR "+ totalPurchasePrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
    }
}
