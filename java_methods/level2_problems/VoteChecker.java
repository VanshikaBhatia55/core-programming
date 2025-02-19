package core_programming.java_methods.level2_problems;

import java.util.Scanner;

public class VoteChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] StudentAge = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age for student " + (i+1) + " : ");
            StudentAge[i] = input.nextInt();
        }
        System.out.println();

        for (int i = 0; i < 10; i++) {
            boolean result = canStudentVote(StudentAge[i]);
            System.out.println("Student with age " + StudentAge[i] + " can vote? " + result);
        }

    }

    public static boolean canStudentVote(int age){
        if(age < 0){
            return false;
        }else if(age >= 18){
            return true;
        }else{
            return false;
        }
    }
}
