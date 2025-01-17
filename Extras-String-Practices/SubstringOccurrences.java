import java.util.Scanner;

public class SubstringOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();

        // Input substring
        System.out.print("Enter the substring to count: ");
        String substring = scanner.nextLine();

        // Count occurrences of the substring
        int count = countSubstringOccurrences(mainString, substring);

        // Output the result
        System.out.println("The substring \"" + substring + "\" occurs " + count + " times in the main string.");
    }

    // Function to count occurrences of a substring
    private static int countSubstringOccurrences(String mainString, String substring) {
        int count = 0;
        int index = 0;

        // Find the substring occurrences
        while ((index = mainString.indexOf(substring, index)) != -1) {
            count++;
            index += substring.length(); // Move index forward by the length of the substring
        }

        return count;
    }
}
