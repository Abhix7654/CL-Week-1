import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Remove duplicates and get the modified string
        String result = removeDuplicates(input);

        // Output the result
        System.out.println("String after removing duplicates: " + result);
    }

    // Function to remove duplicate characters from a string
    private static String removeDuplicates(String str) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // Check if the character is already in the result
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }
}
