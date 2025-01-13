import java.util.Scanner;

class StringComparison {

    // Method to compare two strings using charAt()
    public static boolean compareStringsUsingCharAt(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings
        System.out.print("Enter first string: ");
        String string1 = scanner.next();
        System.out.print("Enter second string: ");
        String string2 = scanner.next();

        // Compare strings using charAt()
        boolean resultUsingCharAt = compareStringsUsingCharAt(string1, string2);

        // Compare strings using equals()
        boolean resultUsingEquals = string1.equals(string2);

        // Display the results
        System.out.println("Comparison using charAt(): " + resultUsingCharAt);
        System.out.println("Comparison using equals(): " + resultUsingEquals);
    }
}
