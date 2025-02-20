package core_programming.string.level2_problems;

public class VotingEligibilityChecker {
    public static void main(String[] args) {
        int[] ages = generateAges(10);
        String[][] votingStatus = checkVotingEligibility(ages);
        displayResults(votingStatus); }

    public static int[] generateAges(int count) {
        int[] ages = new int[count];
        for (int i = 0; i < count; i++) {
            ages[i] = 10 + (int)(Math.random() * 90); // Random age between 10 and 99
        }
        return ages;
    }

    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] result = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            result[i][0] = String.valueOf(ages[i]);
            if (ages[i] < 0) {
                result[i][1] = "false";
            } else {
                result[i][1] = ages[i] >= 18 ? "true" : "false";
            }
        }
        return result;
    }

    public static void displayResults(String[][] votingStatus) {
        System.out.println("\nVoting Eligibility Results:");
        System.out.println("-------------------------");
        System.out.println("Age\tCan Vote");
        System.out.println("-------------------------");
        for (String[] status : votingStatus) {
            System.out.println(status[0] + "\t" + status[1]);
        }
    }

}
