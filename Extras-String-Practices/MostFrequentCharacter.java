import java.util.Scanner;

public class MostFrequentCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Find the most frequent character
        char result = findMostFrequentCharacter(input);

        // Output the result
        System.out.println("Most Frequent Character: '" + result + "'");
    }

    // Function to find the most frequent character
    private static char findMostFrequentCharacter(String str) {
        int[] charCount = new int[256]; // Array to store the frequency of characters (ASCII values)
        int maxCount = 0;
        char mostFrequentChar = str.charAt(0);

        // Count the occurrences of each character
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            charCount[currentChar]++; // Increment count for the character

            // Update most frequent character if necessary
            if (charCount[currentChar] > maxCount) {
                mostFrequentChar = currentChar;
                maxCount = charCount[currentChar];
            }
        }

        return mostFrequentChar;
    }
}
