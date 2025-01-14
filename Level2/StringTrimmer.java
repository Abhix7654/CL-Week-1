import java.util.Scanner;

class StringTrimmer {

    // Method to find the start and end indices after trimming spaces
    public static int[] findTrimIndices(String str) {
        int start = 0;
        int end = str.length() - 1;

        // Find the first non-space character
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }

        // Find the last non-space character
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }

        return new int[]{start, end};
    }

    // Method to create a substring using charAt()
 public static String customSubstring(String str, int start, int end) {
        String str1 = "";
        for (int i = start; i <= end; i++) {
            str1 += str.charAt(i); // Append character by character to str1
        }
        return str1;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string with leading and trailing spaces: ");
        String userInput = scanner.nextLine();

        // Find the start and end indices for trimming
        int[] trimIndices = findTrimIndices(userInput);

        // Get the trimmed string using customSubstring
        String trimmedCustom = customSubstring(userInput, trimIndices[0], trimIndices[1]);

        // Trim spaces using the built-in trim() method
        String trimmedBuiltIn = userInput.trim();

        // Compare the two trimmed strings
        boolean areEqual = compareStrings(trimmedCustom, trimmedBuiltIn);

        // Display results
        System.out.println("\nResults:");
        System.out.println("Original String: \"" + userInput + "\"");
        System.out.println("Custom Trimmed String: \"" + trimmedCustom + "\"");
        System.out.println("Built-in Trimmed String: \"" + trimmedBuiltIn + "\"");
        System.out.println("Are both strings equal? " + areEqual);

        scanner.close();
    }
}
