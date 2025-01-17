import java.util.Scanner;

public class FibonacciSequenceGenerator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter the number of terms in the Fibonacci sequence: ");
        int terms = scanner.nextInt();
        
        // Generating and printing the Fibonacci sequence
        generateFibonacciSequence(terms);
    }

    // Function to generate and print the Fibonacci sequence
    private static void generateFibonacciSequence(int n) {
        // Edge case: If the number of terms is 0 or less
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // First two terms of the Fibonacci sequence
        long first = 0, second = 1;

        // Print the Fibonacci sequence
        System.out.print("Fibonacci Sequence: ");
        
        // Print the first term
        if (n >= 1) {
            System.out.print(first + " ");
        }
        
        // Print the second term
        if (n >= 2) {
            System.out.print(second + " ");
        }
        
        // Generate and print the rest of the terms
        for (int i = 3; i <= n; i++) {
            long nextTerm = first + second;  // Calculate the next term in the sequence
            System.out.print(nextTerm + " ");  // Print the next term
            
            // Update the values of first and second for the next iteration
            first = second;
            second = nextTerm;
        }
        
        System.out.println();  // Newline for better formatting
    }
}
