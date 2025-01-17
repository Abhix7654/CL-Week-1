import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if the two strings are anagrams
        if (areAnagrams(str1, str2)) {
            System.out.println("The strings are anagrams.");
        } else {
            System.out.println("The strings are not anagrams.");
        }
    }

    // Function to check if two strings are anagrams
    private static boolean areAnagrams(String str1, String str2) {
        // If lengths are not the same, they can't be anagrams
        if (str1.length() != str2.length()) {
            return false;
        }

        // Initialize arrays to store frequency counts of characters (assuming ASCII characters)
        int[] frequencyCount1 = new int[256]; // For first string
        int[] frequencyCount2 = new int[256]; // For second string

        // Count frequencies of characters for both strings
        for (int i = 0; i < str1.length(); i++) {
            frequencyCount1[str1.charAt(i)]++; // Count characters in first string
            frequencyCount2[str2.charAt(i)]++; // Count characters in second string
        }

        // Compare frequency counts
        for (int i = 0; i < 256; i++) {
            if (frequencyCount1[i] != frequencyCount2[i]) {
                return false; // If frequencies don't match, they are not anagrams
            }
        }

        return true; // All frequencies match, the strings are anagrams
    }
}
