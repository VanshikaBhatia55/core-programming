package core_programming.arrays_practices.level2_problems;

import java.util.Scanner;

public class StudentsGradesUsingMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of students : ");
        int numberOfStudents = input.nextInt();
        System.out.println();

        //Created arrays to store marks, percentages, and grades
        float[][] marks = new float[numberOfStudents][3]; // Array to store marks
        float[] percentage = new float[numberOfStudents]; // Array to store percentage for each student
        char[] grade = new char[numberOfStudents]; // Array to store grade for each student

        for (int i = 0; i < numberOfStudents; i++) {
            // Input marks in Physics with validation
            while (true) {
                System.out.print("Enter marks in Physics for student " + (i + 1) + ": ");
                marks[i][0] = input.nextFloat();
                if (marks[i][0] < 0 || marks[i][0] >100) {
                    System.out.println("Enter valid values.");
                    continue; // Prompt again for valid input
                }
                break; // Exit the loop if valid input is received
            }

            // Input marks in Maths with validation
            while (true) {
                System.out.print("Enter marks in Maths for student " + (i + 1) + ": ");
                marks[i][1] = input.nextFloat();
                if (marks[i][1] < 0 || marks[i][1] > 100) {
                    System.out.println("Enter valid values.");
                    continue; // Prompt again for valid input
                }
                break; // Exit the loop if valid input is received
            }

            // Input marks in Chemistry with validation
            while (true) {
                System.out.print("Enter marks in Chemistry for student " + (i + 1) + ": ");
                marks[i][2] = input.nextFloat();
                if (marks[i][2] < 0 || marks[i][2] > 100) {
                    System.out.println("Enter valid values.");
                    continue; // Prompt again for valid input
                }
                break; // Exit the loop if valid input is received
            }
            System.out.println();
        }

        // Calculated percentage and grade for each student
        for (int i = 0; i < numberOfStudents; i++) {
            // Calculate total marks
            float totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            // Calculate percentage
            percentage[i] = (totalMarks / 300) * 100;

            // Determine grade based on percentage
            if (percentage[i] >= 80) {
                grade[i] = 'A'; // Grade A for 80% and above
            } else if (percentage[i] >= 70 && percentage[i] <= 79) {
                grade[i] = 'B'; // Grade B for 70% to 79%
            } else if (percentage[i] >= 60 && percentage[i] <= 69) {
                grade[i] = 'C'; // Grade C for 60% to 69%
            } else if (percentage[i] >= 50 && percentage[i] <= 59) {
                grade[i] = 'D'; // Grade D for 50% to 59%
            } else if (percentage[i] >= 40 && percentage[i] <= 49) {
                grade[i] = 'E'; // Grade E for 40% to 49%
            } else {
                grade[i] = 'R'; // Grade R for below 40% (Fail)
            }
        }

        //Displayed the marks, percentage, and grade of each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Marks in Physics of student " + (i + 1) + " : " + marks[i][0]);
            System.out.println("Marks in Maths of student " + (i + 1) + " : " + marks[i][1]);
            System.out.println("Marks in Chemistry of student " + (i + 1) + " : " + marks[i][2]);
            System.out.println("Percentage of student " + (i + 1) + " : " + percentage[i]);
            System.out.println("Grade of student " + (i + 1) + " : " + grade[i]);
            System.out.println();
        }
    }
}
