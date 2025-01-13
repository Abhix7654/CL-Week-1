import java.util.Scanner;

class StringIndexExceptionExample {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String str) {
        System.out.println("Accessing character at invalid index...");
        System.out.println(str.charAt(str.length())); // Invalid index
    }

    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String str) {
        try {
            System.out.println("Accessing character at invalid index...");
            System.out.println(str.charAt(str.length())); // Invalid index
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter the string: ");
        String str = scanner.next();

        // Generate and handle exception
        try {
            generateException(str);
        } catch (java.lang.StringIndexOutOfBoundsException e) {
            System.out.println("Caught exception in main: " + e.getMessage());
        }
        
        handleException(str);

        scanner.close();
    }
}
