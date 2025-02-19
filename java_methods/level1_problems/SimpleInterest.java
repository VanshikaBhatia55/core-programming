package core_programming.java_methods.level1_problems;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the value of principal : ");
        double principal = input.nextDouble();
        System.out.print("Enter the value of rate : ");
        int rate = input.nextInt();
        System.out.print("Enter the value of time : ");
        int time = input.nextInt();

        simpleInterestCalculate(principal,rate,time);
    }
    public static void simpleInterestCalculate(double p, int r, int t){
        double SI = (p * r * t) / 100;
        System.out.println("The Simple Interest is "+ SI +" for Principal "+ p +" , Rate of Interest "+ r +" and Time "+ t);
    }
}
