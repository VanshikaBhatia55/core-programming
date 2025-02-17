package core_programming.arrays_practices.level2_problems;

import java.util.Scanner;

public class AgeHeightComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] name = {"Amar","Akbar", "Anthony"};
        int[] age = new int[3];
        double[] height = new double[3];


        for (int i = 0; i < 3; i++) {
            System.out.print("Print age of person "+ name[i] +" : ");
            age[i] = input.nextInt();
            System.out.print("Print height of person "+ name[i] +" : ");
            height[i] = input.nextDouble();
        }

        int youngest = Integer.MAX_VALUE;
        double tallest = Integer.MIN_VALUE;
        int indexAge = 0;
        int indexHeight = 0;
        for (int i = 0; i < 3; i++) {
            if(age[i] < youngest ){
                youngest = age[i];
                indexAge = i;
            }
            if(height[i] > tallest){
                tallest = height[i];
                indexHeight = i;
            }
        }

        System.out.println("Youngest friend with "+youngest+" age : "+ name[indexAge]);
        System.out.println("Tallest friend with "+tallest+" height : "+ name[indexHeight]);
    }
}
