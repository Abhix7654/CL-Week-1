import java.util.Scanner;

class StringLengthFinder {

    // Method to find and return the length of a string without using length()
    public static int findLengthWithoutLengthMethod(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // Attempt to access the character at the index
                count++;           // Increment the count if no exception is thrown
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception caught when trying to access index out of bounds, length is found
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String userInput = scanner.next();

        // Calculate length using user-defined method
        int customLength = findLengthWithoutLengthMethod(userInput);

        // Calculate length using the built-in length() method
        int builtInLength = userInput.length();

        // Display the results
        System.out.println("Length calculated using custom method: " + customLength);
        System.out.println("Length calculated using built-in method: " + builtInLength);

        scanner.close();
    }
}
