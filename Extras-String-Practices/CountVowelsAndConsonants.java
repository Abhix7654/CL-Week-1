import java.util.Scanner;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Initialize counts
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert to lowercase for simplicity
        input = input.toLowerCase();

        // Loop through each character
        for (char ch : input.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') { // Check if character is a letter
                if (isVowel(ch)) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        // Output the results
        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
    }

    // Function to check if a character is a vowel
    private static boolean isVowel(char ch) {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
