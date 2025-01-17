import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("Think of a number between 1 and 100, and I will try to guess it.");
        System.out.println("Respond with 'high', 'low', or 'correct' based on my guesses.");

        // Start the guessing game
        playGame(scanner);
    }

    // Function to play the game
    private static void playGame(Scanner scanner) {
        int low = 1;
        int high = 100;
        int guess = 0;
        String feedback = "";

        while (!feedback.equals("correct")) {
            // Generate a random guess
            guess = generateGuess(low, high);

            // Get feedback from the user
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
            feedback = scanner.nextLine().toLowerCase();

            // Adjust the guess range based on the feedback
            if (feedback.equals("high")) {
                high = guess - 1; // The number is lower than the guess
            } else if (feedback.equals("low")) {
                low = guess + 1; // The number is higher than the guess
            } else if (feedback.equals("correct")) {
                System.out.println("Yay! I guessed your number " + guess + " correctly!");
            } else {
                System.out.println("Invalid feedback. Please enter 'high', 'low', or 'correct'.");
            }
        }
    }

    // Function to generate a random guess within the given range
    private static int generateGuess(int low, int high) {
        Random random = new Random();
        return random.nextInt(low,high); // Generates a number between low and high
    }
}
