import java.util.Scanner;

class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if the number is natural
        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        // Calculate sum using recursion
        int recursiveSum = sumUsingRecursion(n);
        System.out.println("Sum using recursion: " + recursiveSum);

        // Calculate sum using formula
        int formulaSum = sumUsingFormula(n);
        System.out.println("Sum using formula: " + formulaSum);

        // Compare results
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("There is a mismatch between the results.");
        }
    }

    // Method to calculate the sum of n natural numbers recursively
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

   // Method to calculate the sum of n natural numbers by formula
    public static int sumUsingFormula(int n) {
      int sum=n * (n + 1) / 2;
        return sum;
    }
}