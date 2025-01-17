import java.util.Scanner;

public class PalindromeCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the string is a palindrome
        boolean isPalindrome = checkPalindrome(input);

        // Output the result
        if (isPalindrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }

    // Function to check if a string is a palindrome
    private static boolean checkPalindrome(String str) {
        int start = 0, end = str.length() - 1;

        // Convert to lowercase for case-insensitive comparison
        str = str.toLowerCase();

        // Compare characters from the start and the end
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false; // Not a palindrome
            }
            start++;
            end--;
        }

        return true; // It's a palindrome
    }
}
