import java.util.Scanner;

public class ToggleCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Toggle case of each character
        String result = toggleCase(input);

        // Output the result
        System.out.println("String after toggling case: " + result);
    }

    // Function to toggle the case of each character
    private static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();

        // Loop through each character in the string
        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            // Toggle the case of the current character
            if (Character.isUpperCase(currentChar)) {
                result.append(Character.toLowerCase(currentChar));  // Convert uppercase to lowercase
            } else if (Character.isLowerCase(currentChar)) {
                result.append(Character.toUpperCase(currentChar));  // Convert lowercase to uppercase
            } else {
                result.append(currentChar);  // If it's neither (like a space or punctuation), add as is
            }
        }

        return result.toString();
    }
}
