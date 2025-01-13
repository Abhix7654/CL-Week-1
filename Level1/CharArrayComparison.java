import java.util.Scanner;

class CharArrayComparison {

    // Method to return characters from a string without using toCharArray()
    public static char[] getCharsFromString(String str) {
        char[] chars = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            chars[i] = str.charAt(i);
        }
        return chars;
    }

    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter the string: ");
        String str = scanner.next();

        // Get characters using user-defined method
        char[] charsUsingMethod = getCharsFromString(str);

        // Get characters using toCharArray()
        char[] charsUsingToCharArray = str.toCharArray();

        // Compare results
        boolean areEqual = compareCharArrays(charsUsingMethod, charsUsingToCharArray);

        // Display results
        System.out.println("Characters using user-defined method: " + String.valueOf(charsUsingMethod));
        System.out.println("Characters using toCharArray(): " + String.valueOf(charsUsingToCharArray));
        System.out.println("Are both arrays equal? " + areEqual);
    }
}
