import java.util.Scanner;

public class LongestWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        // Find and display the longest word
        String longestWord = findLongestWord(sentence);
        System.out.println("The longest word is: " + longestWord);
    }

    // Function to find the longest word in a sentence
    private static String findLongestWord(String sentence) {
        String[] words = sentence.split("\\s+"); // Split the sentence into words
        String longest = "";

        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }

        return longest;
    }
}
