package core_programming.java_programming_elements.level1_problems;

import java.util.Scanner;

public class MaximumHandshakes {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int numberOfStudents = input.nextInt();

        int maxHandshakes = (numberOfStudents * (numberOfStudents - 1)) / 2;

        System.out.println("Maximum number of handshakes among " + numberOfStudents +" number of students is " + maxHandshakes);
    }
}
