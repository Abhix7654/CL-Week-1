import java.util.Scanner;

class Problem10 {

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

        // Create an array to store the frequency of digits (size 10 for digits 0-9)
        int[] frequency = new int[10];

        // Count the frequency of each digit
        for (int i = 0; i < digits.length; i++) {
            frequency[digits[i]]++; // Increase the count for the digit
        }

        // Display the frequency of each digit
        System.out.println("Frequency of each digit in the number:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) {
                System.out.println(i + ": " + frequency[i]);
            }
        }
    }
}
