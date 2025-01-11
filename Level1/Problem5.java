import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        // Create a Scanner object to get user input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        // Define an array to store multiplication results
        int[] multiplicationResult = new int[4];

        // Multiplying the entered number with 6, 7, 8, and 9
        for (int i = 6, index = 0; i <= 9; i++, index++) {
            multiplicationResult[index] = number * i;
        }

        // Display the result
        System.out.println("Multiplication table of " + number + " with 6, 7, 8, and 9:");
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }
    }
}
