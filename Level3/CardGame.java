import java.util.Random;

class CardGame {

    private static final String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
    private static final int numOfCards = suits.length * ranks.length;

    public static String[] initializeDeck() {
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }

    public static String[] shuffleDeck(String[] deck) {
        Random random = new Random();
        for (int i = 0; i < deck.length; i++) {
            int randomCardNumber = i + random.nextInt(deck.length - i);
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
        return deck;
    }

    public static String[][] distributeDeck(String[] deck, int numPlayers) {
        if (numPlayers <= 0 || numPlayers > deck.length) {
            System.out.println("Invalid number of players. Must be between 1 and " + deck.length);
            return null;
        }

        if (deck.length % numPlayers != 0) {
            System.out.println("Cannot distribute the deck evenly among the players. " +
                    "Each player would get approximately " + (deck.length / numPlayers) + " cards.");
            return null;
        }

        String[][] players = new String[numPlayers][deck.length / numPlayers];
        int index = 0;
        for (int i = 0; i < numPlayers; i++) {
            for (int j = 0; j < deck.length / numPlayers; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }

    public static void printPlayers(String[][] players) {
        if (players == null) return;

        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println(card);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String[] deck = initializeDeck();
        deck = shuffleDeck(deck);

        int numPlayers = 4; // Adjust this value to test with different numbers of players
        String[][] players = distributeDeck(deck, numPlayers);

        if (players != null) {
            printPlayers(players);
        }
    }
}
