import java.util.Scanner;

class TextToLowercase {

    // Method to convert text to uppercase using charAt()
    public static String convertToLowerUsingCharAt(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                result.append((char) (ch + 32));
            } else {
                result.append(ch);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input text
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        // Convert text to uppercase using charAt() and built-in method
        String LowerUsingCharAt = convertToLowerUsingCharAt(text);
        String LowerUsingBuiltIn = text.toLowerCase();

        // Compare results
        boolean areEqual =LowerUsingCharAt.equals(LowerUsingBuiltIn);

        // Display results
        System.out.println("Lowercase using charAt(): " + LowerUsingCharAt);
        System.out.println("Lowercase using built-in method: " + LowerUsingBuiltIn);
        System.out.println("Are both results equal? " + areEqual);
    }
}
