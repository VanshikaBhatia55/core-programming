package core_programming.arrays_practices.level2_problems;

import java.util.Scanner;

public class BMIUsingMatrix {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number of person: ");
        int numberOfPerson = input.nextInt();
        System.out.println();

        // Created a 2D array to store weight, height, and BMI for each person
        double[][] personData = new double[numberOfPerson][3]; // 0: weight, 1: height, 2: BMI
        String[] weightStatus = new String[numberOfPerson]; // Array to store weight status for each person

        // Loop to take input for weight and height for each person
        for (int i = 0; i < personData.length; i++) {
            while (true) {
                // Input weight for the current person
                System.out.print("Enter weight in kgs of person " + (i + 1) + " : ");
                personData[i][0] = input.nextDouble(); // Store weight in the first column
                if (personData[i][0] <= 0) {
                    System.out.println("Enter positive value.");
                    continue;
                }
                break;
            }

            while (true){
                // Input height for the current person
                System.out.print("Enter height in meters of person " + (i + 1) + " : ");
                personData[i][1] = input.nextDouble(); // Store height in the second column
                if (personData[i][1] <= 0) {
                    System.out.println("Enter positive value.");
                    continue;
                }
                break;
            }
            System.out.println();

                // Calculated BMI using the formula: weight / (height * height)
                personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]); // Store BMI in the third column

                // weight status based on BMI value
                if (personData[i][2] <= 18.4) {
                    weightStatus[i] = "UnderWeight"; // BMI less than or equal to 18.4
                } else if (personData[i][2] >= 18.5 && personData[i][2] < 24.9) {
                    weightStatus[i] = "Normal"; // BMI between 18.5 and 24.9
                } else if (personData[i][2] >= 25.0 && personData[i][2] < 30.0) {
                    weightStatus[i] = "Overweight"; // BMI between 25.0 and 29.9
                } else {
                    weightStatus[i] = "Obese"; // BMI 30.0 and above
                }
            }


        //Displayed the results for each person
        for (int i = 0; i < numberOfPerson; i++) {
            System.out.println("Weight of person " + (i + 1) + " : " + personData[i][0]);
            System.out.println("Height of person " + (i + 1) + " : " + personData[i][1]);
            System.out.println("BMI of person " + (i + 1) + " : " + personData[i][2]);
            System.out.println("Weight Status of person " + (i + 1) + " : " + weightStatus[i]);
            System.out.println(); // Print a blank line for better readability
        }

    }
}