package core_programming.java_methods.level3_problems;

import java.util.Scanner;

public class ASCIIValues {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text = input.next();
        int[][] charASCIIValues = findASCIIValues(text);
        displayASCIIValues(text,charASCIIValues);
    }

    public static int[][] findASCIIValues(String text){
        int[][] charASCIIValues = new int[text.length()][2];

        for (int i = 0; i < text.length(); i++) {
            charASCIIValues[i][0] = text.charAt(i);
            charASCIIValues[i][1] = text.charAt(i);
        }

        return charASCIIValues;
    }

    public static void displayASCIIValues(String text, int[][] charASCIIValues) {
        System.out.println("Characters and their corresponding ASCII values " +
                "for " + text + " is:");
        for (int i = 0; i < charASCIIValues.length; i++) {
            System.out.println((char)charASCIIValues[i][0] + "-" +
                    charASCIIValues[i][1]);
        }
    }

}
