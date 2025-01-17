import java.util.Scanner;

public class CompareStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter the first string: ");
        String string1 = scanner.nextLine();
        
        System.out.print("Enter the second string: ");
        String string2 = scanner.nextLine();

        // Compare the strings lexicographically
        int result = compareStrings(string1, string2);

        // Output the result based on comparison
        if (result < 0) {
            System.out.println("\"" + string1 + "\" comes before \"" + string2 + "\" in lexicographical order.");
        } else if (result > 0) {
            System.out.println("\"" + string1 + "\" comes after \"" + string2 + "\" in lexicographical order.");
        } else {
            System.out.println("Both strings are equal.");
        }
    }

    // Function to compare two strings lexicographically
    private static int compareStrings(String str1, String str2) {
        // Get the length of both strings
        int length1 = str1.length();
        int length2 = str2.length();
        
        // Compare characters one by one
        for (int i = 0; i < Math.min(length1, length2); i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);

            // If characters are different, return the difference
            if (char1 != char2) {
                return char1 - char2;
            }
        }

        // If all characters are the same, the shorter string comes first
        return length1 - length2;
    }
}
