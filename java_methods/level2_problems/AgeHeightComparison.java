package core_programming.java_methods.level2_problems;
import java.util.Scanner;

public class AgeHeightComparison {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] name = {"Amar","Akbar", "Anthony"};
        int[] age = new int[3];
        int[] height = new int[3];


        for (int i = 0; i < 3; i++) {
            System.out.print("Print age of person "+ name[i] +" : ");
            age[i] = input.nextInt();

            System.out.print("Print height of person "+ name[i] +" : ");
            height[i] = input.nextInt();
            System.out.println();
        }

        int[] youngestFriend = youngest(age);
        int[] tallestFriend = tallest(height);

        System.out.println("Youngest friend with "+youngestFriend[1]+" age : "+ name[youngestFriend[0]]);
        System.out.println("Tallest friend with "+tallestFriend[1]+" height : "+ name[tallestFriend[0]]);
    }

    public static int[] youngest(int[] age){
        int youngest = Integer.MAX_VALUE;
        int indexAge = 0;
        for (int i = 0; i < 3; i++) {
            if(age[i] < youngest ){
                youngest = age[i];
                indexAge = i;
            }
        }
        return new int[]{indexAge,youngest};
    }

    public static int[] tallest(int[] height){
        int tallest = Integer.MIN_VALUE;
        int indexHeight = 0;
        for (int i = 0; i < 3; i++) {
            if(height[i] > tallest){
                tallest = height[i];
                indexHeight = i;
            }
        }

        return new int[]{indexHeight,tallest};
    }
}

