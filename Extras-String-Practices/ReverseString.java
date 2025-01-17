import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Reverse the string
        String reversed = reverseString(input);

        // Output the result
        System.out.println("Reversed string: " + reversed);
    }

    // Function to reverse a string
    private static String reverseString(String str) {
        char[] charArray = str.toCharArray();
        int start = 0, end = str.length() - 1;

        // Swap characters from start and end moving towards the middle
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        return new String(charArray);
    }
}
