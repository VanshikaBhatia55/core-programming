package core_programming.extras.string_practice_problems;

import java.util.Scanner;

public class SubstringCounter {
    public static int countSubstringOccurrences(String str, String substr) {
        int count = 0;
        int index = 0;

        while ((index = str.indexOf(substr, index)) != -1) {
            count++;
            index += 1;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the main string: ");
        String mainStr = scanner.nextLine();
        System.out.print("Enter the substring to find: ");
        String subStr = scanner.nextLine();
        System.out.println("Occurrences: " + countSubstringOccurrences(mainStr, subStr));
        scanner.close();
    }
}
