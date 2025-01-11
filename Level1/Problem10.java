import java.util.Scanner;

class Problem10 {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for a positive integer
        System.out.print("Enter a positive integer: ");
        int number = input.nextInt();

        // Validate the input
        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            System.exit(0);
        }

        // Create an array to store the results
        String[] results = new String[number + 1];

        // Loop through from 1 to the input number and calculate FizzBuzz results
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = Integer.toString(i);
            }
        }

        // Display the results in the format Position n = result
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        // Close the Scanner Object
        input.close();
    }
}
