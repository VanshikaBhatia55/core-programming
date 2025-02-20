package core_programming.string.level2_problems;

import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of games to play:");
        int numGames = scanner.nextInt();

        String[][] results = new String[numGames][3]; // [game][player choice, computer choice, winner]
        playGames(numGames, results);
        displayResults(results);

        scanner.close();
    }

    public static String getComputerChoice() {
        int choice = (int)(Math.random() * 3);
        return switch (choice) {
            case 0 -> "Rock";
            case 1 -> "Paper";
            default -> "Scissors";
        };
    }

    public static String determineWinner(String playerChoice, String computerChoice) {
        if (playerChoice.equals(computerChoice)) {
            return "Tie";
        }

        if ((playerChoice.equals("Rock") && computerChoice.equals("Scissors")) ||
                (playerChoice.equals("Paper") && computerChoice.equals("Rock")) ||
                (playerChoice.equals("Scissors") && computerChoice.equals("Paper"))) {
            return "Player";
        }

        return "Computer";
    }

    public static void playGames(int numGames, String[][] results) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < numGames; i++) {
            System.out.println("\nGame " + (i + 1));
            System.out.println("Enter your choice (Rock/Paper/Scissors):");
            String playerChoice = scanner.next();
            String computerChoice = getComputerChoice();

            results[i][0] = playerChoice;
            results[i][1] = computerChoice;
            results[i][2] = determineWinner(playerChoice, computerChoice);
        }
    }

    public static String[][] calculateStats(String[][] results) {
        int playerWins = 0, computerWins = 0, ties = 0;

        for (String[] result : results) {
            switch (result[2]) {
                case "Player" -> playerWins++;
                case "Computer" -> computerWins++;
                case "Tie" -> ties++;
            }
        }

        double total = results.length;
        String[][] stats = new String[3][2];
        stats[0] = new String[]{"Player", String.format("%.2f%%", (playerWins/total)*100)};
        stats[1] = new String[]{"Computer", String.format("%.2f%%", (computerWins/total)*100)};
        stats[2] = new String[]{"Ties", String.format("%.2f%%", (ties/total)*100)};

        return stats;
    }

    public static void displayResults(String[][] results) {
        System.out.println("\nGame Results:");
        System.out.println("----------------------------------------");
        System.out.println("Game\tPlayer\tComputer\tWinner");
        System.out.println("----------------------------------------");

        for (int i = 0; i < results.length; i++) {
            System.out.println((i + 1) + "\t" + results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2]);
        }

        String[][] stats = calculateStats(results);
        System.out.println("\nStatistics:");
        System.out.println("----------------");
        System.out.println("Player\tWin %");
        System.out.println("----------------");
        for (String[] stat : stats) {
            System.out.println(stat[0] + "\t" + stat[1]);
        }
    }
}
