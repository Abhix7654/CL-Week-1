import java.util.Scanner;

class NumberFormatExceptionDemo {

    // Method to generate NumberFormatException
    public static void generateException(String input) {
        System.out.println("Parsing string to number...");
        int number = Integer.parseInt(input); // Invalid number format
        System.out.println("Parsed number: " + number);
    }

    // Method to handle NumberFormatException
    public static void handleException(String input) {
        try {
            System.out.println("Parsing string to number...");
            int number = Integer.parseInt(input);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a number as a string: ");
        String input = scanner.next();

        // Generate and handle exception
        generateException(input);
        handleException(input);
    }
}
