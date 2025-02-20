package core_programming.string.level3_problems;

import java.util.Scanner;

public class UniqueCharacters {
    public static int getLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    public static char[] findUniqueChars(String text) {
        int length = getLength(text);
        char[] result = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (text.charAt(i) == text.charAt(j)) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                result[uniqueCount] = text.charAt(i);
                uniqueCount++;
            }
        }

        char[] uniqueChars = new char[uniqueCount];
        System.arraycopy(result, 0, uniqueChars, 0, uniqueCount);
        return uniqueChars;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        char[] uniqueChars = findUniqueChars(text);

        System.out.println("\nUnique characters in the string:");
        for (char c : uniqueChars) {
            System.out.print(c + " ");
        }
        scanner.close();
    }
}
