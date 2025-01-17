import java.util.Scanner;

public class WordReplace {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input sentence, word to replace, and replacement word
        System.out.print("Enter the sentence: ");
        String sentence = scanner.nextLine();

        System.out.print("Enter the word to replace: ");
        String wordToReplace = scanner.nextLine();

        System.out.print("Enter the replacement word: ");
        String replacementWord = scanner.nextLine();

        // Call the replace method
        String modifiedSentence = replace(sentence, wordToReplace, replacementWord);

        // Output the modified sentence
        System.out.println("Modified Sentence: " + modifiedSentence);
    }

    // Custom replace method
    public static String replace(String sentence, String wordToReplace, String replacementWord) {
        // Check if the sentence or word to replace is empty
        if (sentence == null || wordToReplace == null || replacementWord == null || wordToReplace.isEmpty()) {
            return sentence; // No replacement if input is invalid
        }

        // Initialize a StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        // Split the sentence into words
        String[] words = sentence.split(" "); // Split by spaces

        // Iterate over each word in the sentence
        for (String word : words) {
            // If the current word matches the word to replace, use the replacement word
            if (word.equals(wordToReplace)) {
                result.append(replacementWord);
            } else {
                result.append(word);
            }
            result.append(" "); // Add space after each word
        }

        // Remove the trailing space from the result
        return result.toString().trim();
    }
}
