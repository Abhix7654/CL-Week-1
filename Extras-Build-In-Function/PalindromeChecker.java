import java.util.Scanner;

public class PalindromeChecker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        String input = getInput(scanner);

        // Checking if the input is a palindrome
        boolean isPalindrome = isPalindrome(input);

        // Displaying the result
        displayResult(input, isPalindrome);
    }

    // Function to get input from the user
    private static String getInput(Scanner scanner) {
        System.out.print("Enter a string: ");
        return scanner.nextLine();
    }

    // Function to check if a string is a palindrome
    private static boolean isPalindrome(String str) {
        // Remove spaces and convert to lowercase for accurate comparison
        str = str.replaceAll("\\s", "").toLowerCase();

        // Initialize pointers for the start and end of the string
        int left = 0;
        int right = str.length() - 1;

        // Compare characters from both ends
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;  // If characters don't match, it's not a palindrome
            }
            left++;
            right--;
        }
        return true;  // If all characters match, it's a palindrome
    }

    // Function to display the result
    private static void displayResult(String str, boolean isPalindrome) {
        if (isPalindrome) {
            System.out.println("\"" + str + "\" is a palindrome.");
        } else {
            System.out.println("\"" + str + "\" is not a palindrome.");
        }
    }
}
