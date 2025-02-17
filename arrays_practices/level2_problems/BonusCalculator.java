package core_programming.arrays_practices.level2_problems;

import java.util.Scanner;

public class BonusCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfEmployees = 10;

        double[] salary = new double[numberOfEmployees];
        int[] yearsOfService = new int[numberOfEmployees];

        double[] bonus = new double[numberOfEmployees];

        double totalBonus = 0.0;
        double oldSalary = 0.0;
        double NewSalary = 0.0;

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.print("Enter service years of person " + (i+1) +": ");
            yearsOfService[i] = input.nextInt();
            if(yearsOfService[i] <= 0){
                i--;
            }
        }

        for (int i = 0; i < numberOfEmployees; i++) {
            System.out.print("Enter salary of person " + (i+1) +" : ");
            salary[i] = input.nextDouble();
            oldSalary += salary[i];
        }

        for (int i = 0; i < numberOfEmployees; i++) {
            if(yearsOfService[i] >= 5){
                bonus[i] = salary[i] * 0.05;
                totalBonus+=bonus[i];
                NewSalary += salary[i] + bonus[i];
            }else{
                bonus[i] = salary[i] * 0.02;
                totalBonus += bonus[i];
                NewSalary += salary[i] + bonus[i];

            }
        }
        System.out.println("Total bonus : " + totalBonus);
        System.out.println("Old Salary : " + oldSalary);
        System.out.println("New Salary : " + NewSalary);
    }
}
