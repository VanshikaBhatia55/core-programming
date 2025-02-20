package core_programming.string.level3_problems;

import java.util.Scanner;

public class CardDeck {
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {
            "2", "3", "4", "5", "6", "7", "8", "9", "10",
            "Jack", "Queen", "King", "Ace"
    };

    public static String[] initializeDeck() {
        int numOfCards = SUITS.length * RANKS.length;
        String[] deck = new String[numOfCards];
        int index = 0;

        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index] = rank + " of " + suit;
                index++;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            // Generate random index between i and n
            int randomCardNumber = i + (int) (Math.random() * (n - i));

            // Swap current card with random card
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distributeCards(String[] deck, int numPlayers, int cardsPerPlayer) {
        // Check if distribution is possible
        if (numPlayers <= 0 || cardsPerPlayer <= 0 ||
                numPlayers * cardsPerPlayer > deck.length) {
            return null;
        }

        String[][] players = new String[numPlayers][cardsPerPlayer];
        int cardIndex = 0;

        // Distribute cards to each player
        for (int i = 0; i < cardsPerPlayer; i++) {
            for (int j = 0; j < numPlayers; j++) {
                players[j][i] = deck[cardIndex];
                cardIndex++;
            }
        }

        return players;
    }

    public static void printPlayerCards(String[][] players) {
        for (int i = 0; i < players.length; i++) {
            System.out.println("\nPlayer " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println("- " + card);
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Initialize and shuffle the deck
        String[] deck = initializeDeck();
        System.out.println("Deck initialized with " + deck.length + " cards.");

        deck = shuffleDeck(deck);
        System.out.println("Deck has been shuffled.");

        // Get distribution details from user
        System.out.print("\nEnter number of players: ");
        int numPlayers = scanner.nextInt();

        System.out.print("Enter number of cards per player: ");
        int cardsPerPlayer = scanner.nextInt();

        // Distribute and display cards
        String[][] players = distributeCards(deck, numPlayers, cardsPerPlayer);

        if (players == null) {
            System.out.println("\nError: Cannot distribute " + cardsPerPlayer +
                    " cards to " + numPlayers + " players.");
            System.out.println("Total cards needed: " + (numPlayers * cardsPerPlayer));
            System.out.println("Available cards: " + deck.length);
        } else {
            printPlayerCards(players);
        }

        scanner.close();
    }
}