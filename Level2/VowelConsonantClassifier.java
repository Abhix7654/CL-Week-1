import java.util.Scanner;

class VowelConsonantClassifier {

    // Method to check if the character is a vowel, consonant, or not a letter
    public static String checkCharacter(char ch) {
        // Convert character to lowercase if uppercase
        if (ch >= 'A' && ch <= 'Z') {
            ch = (char) (ch + 32);
        }

        // Check if the character is a vowel
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            return "Vowel";
        }
        // Check if the character is a consonant
        else if (ch >= 'a' && ch <= 'z') {
            return "Consonant";
        }
        // If not a letter
        else {
            return "Not a Letter";
        }
    }

    // Method to classify each character in a string
    public static String[][] classifyCharacters(String input) {
        int length = input.length();
        String[][] result = new String[length][2];

        // Loop through each character in the string
        for (int i = 0; i < length; i++) {
            char ch = input.charAt(i);
            result[i][0] = String.valueOf(ch); // Store the character
            result[i][1] = checkCharacter(ch); // Store the classification
        }

        return result;
    }

    // Method to display the 2D array in a tabular format
    public static void displayResults(String[][] array) {
      

        for (String[] row : array) {
            System.out.printf("%-10s %-15s%n", row[0], row[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String userInput = scanner.nextLine();

        // Classify characters
        String[][] classifiedCharacters = classifyCharacters(userInput);

        // Display the results in a tabular format
       
        displayResults(classifiedCharacters);

        scanner.close();
    }
}
