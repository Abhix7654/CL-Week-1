import java.util.Scanner;

public class FactorialUsingRecursion {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user
        int number = getInput(scanner);

        // Calculating the factorial using recursion
        long factorial = calculateFactorial(number);

        // Displaying the result
        displayResult(number, factorial);
    }

    // Function to get input from the user
    private static int getInput(Scanner scanner) {
        System.out.print("Enter a number: ");
        return scanner.nextInt();
    }

    // Recursive function to calculate factorial
    private static long calculateFactorial(int num) {
        // Base case: factorial of 0 or 1 is 1
        if (num == 0 || num == 1) {
            return 1;
        }

        // Recursive case: num * factorial of (num - 1)
        return num * calculateFactorial(num - 1);
    }

    // Function to display the result
    private static void displayResult(int num, long factorial) {
        System.out.println("Factorial of " + num + " is: " + factorial);
    }
}
