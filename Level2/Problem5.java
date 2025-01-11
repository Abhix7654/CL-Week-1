import java.util.Scanner;

class Problem5 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Find the count of digits in the number
        int temp = number;
        int count = 0;
        while (temp != 0) {
            temp /= 10;
            count++;
        }

        // Create an array to store the digits of the number
        int[] digits = new int[count];
        int index = 0;

        // Extract digits and store them in the array
        while (number != 0) {
            digits[index] = number % 10; // Get the last digit
            number /= 10; // Remove the last digit
            index++;
        }

        // Display the elements of the digits array in reverse order
        System.out.print("Reversed number: ");
        for (int i = 0; i < digits.length; i++) {
            System.out.print(digits[i]);
        }
        System.out.println(); // For newline
    }
}
