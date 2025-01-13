import java.util.Scanner;

class SubstringComparison {

    // Method to create substring using charAt()
    public static String createSubstringUsingCharAt(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i < end; i++) {
            substring.append(str.charAt(i));
        }
        return substring.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string and indices
        System.out.print("Enter the string: ");
        String str = scanner.next();
        System.out.print("Enter the start index: ");
        int startIndex = scanner.nextInt();
        System.out.print("Enter the end index: ");
        int endIndex = scanner.nextInt();

        // Create substring using charAt()
        String substringUsingCharAt = createSubstringUsingCharAt(str, startIndex, endIndex);

        // Create substring using built-in method
        String substringUsingBuiltIn = str.substring(startIndex, endIndex);

        // Compare results
        boolean areEqual = substringUsingCharAt.equals(substringUsingBuiltIn);

        // Display results
        System.out.println("Substring using charAt(): " + substringUsingCharAt);
        System.out.println("Substring using substring(): " + substringUsingBuiltIn);
        System.out.println("Are both substrings equal? " + areEqual);
    }
}
