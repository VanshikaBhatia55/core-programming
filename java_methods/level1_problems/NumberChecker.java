package core_programming.java_methods.level1_problems;

import java.util.Scanner;

public class NumberChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int number = input.nextInt();

        int result = numCheck(number);
        System.out.println("For given number " + number +" result will be : " + result);
    }

    public static int numCheck(int number){
        if(number < 0)  return -1;
        else if (number > 0)    return 1;
        else return 0;
    }
}
