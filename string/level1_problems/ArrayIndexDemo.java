package core_programming.string.level1_problems;

import java.util.Scanner;

public class ArrayIndexDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array:");
        int size = scanner.nextInt();
        String[] names = new String[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Enter name " + (i + 1) + ":");
            names[i] = scanner.next();
        }

        generateException(names);
        handleException(names);
    }

    public static void generateException(String[] names) {
        // This will throw ArrayIndexOutOfBoundsException
        System.out.println(names[names.length + 1]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length + 1]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}
