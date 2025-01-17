import java.util.Scanner;

public class RemoveCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Input character to remove
        System.out.print("Enter character to remove: ");
        char charToRemove = scanner.next().charAt(0);

        // Remove the specified character
        String result = removeCharacter(input, charToRemove);

        // Output the result
        System.out.println("Modified String: \"" + result + "\"");
    }

    // Function to remove all occurrences of a specific character from a string
    private static String removeCharacter(String str, char charToRemove) {
        StringBuilder result = new StringBuilder();

        // Iterate through the string and append characters that are not the one to remove
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != charToRemove) {
                result.append(str.charAt(i));
            }
        }

        return result.toString();
    }
}
