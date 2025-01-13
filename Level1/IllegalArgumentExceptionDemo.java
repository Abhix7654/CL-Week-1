import java.util.Scanner;

class IllegalArgumentExceptionDemo {

    // Method to generate IllegalArgumentException
    public static void generateException(String str, int start, int end) {
        // This method generates an exception without handling it
        System.out.println("Trying to create a substring with invalid indices...");
        System.out.println(str.substring(start, end)); // Will generate an exception
    }

    // Method to handle IllegalArgumentException
    public static void handleException(String str, int start, int end) {
        try {
            System.out.println("Trying to create a substring with invalid indices...");
            System.out.println(str.substring(start, end)); // Attempt to create substring
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught Generic RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a string: ");
        String str = scanner.next();
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();

        // Generate and handle exceptions
        System.out.println("\n--- Generating Exception ---");
        try {
            generateException(str, start, end);
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException in main: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught RuntimeException in main: " + e.getMessage());
        }

        System.out.println("\n--- Handling Exception ---");
        handleException(str, start, end);
    }
}
