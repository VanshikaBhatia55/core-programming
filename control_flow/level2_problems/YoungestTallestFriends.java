package core_programming.control_flow.level2_problems;

import java.util.Scanner;

public class YoungestTallestFriends {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int ageAmar = input.nextInt();
        double heightAmar = input.nextDouble();

        int ageAkbar = input.nextInt();
        double heightAkbar = input.nextDouble();

        int ageAnthony = input.nextInt();
        double heightAnthony = input.nextDouble();

        int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
        String youngestFriend = "";

        if (youngestAge == ageAmar) {
            youngestFriend = "Amar";
        } else if (youngestAge == ageAkbar) {
            youngestFriend = "Akbar";
        } else {
            youngestFriend = "Anthony";
        }


        double tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
        String tallestFriend = "";

        if (tallestHeight == heightAmar) {
            tallestFriend = "Amar";
        } else if (tallestHeight == heightAkbar) {
            tallestFriend = "Akbar";
        } else {
            tallestFriend = "Anthony";
        }

        System.out.println("The youngest friend is "+ youngestFriend +" with age " + youngestAge);
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight);

    }
}
