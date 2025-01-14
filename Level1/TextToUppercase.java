import java.util.Scanner;

class TextToUppercase {

    // Method to convert text to uppercase using charAt()
    public static String convertToUpperUsingCharAt(String text) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                result.append((char) (ch - 32));
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
        String upperUsingCharAt = convertToUpperUsingCharAt(text);
        String upperUsingBuiltIn = text.toUpperCase();

        // Compare results
        boolean areEqual = upperUsingCharAt.equals(upperUsingBuiltIn);

        // Display results
        System.out.println("Uppercase using charAt(): " + upperUsingCharAt);
        System.out.println("Uppercase using built-in method: " + upperUsingBuiltIn);
        System.out.println("Are both results equal? " + areEqual);
    }
}
