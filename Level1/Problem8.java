import java.util.Scanner;

class Problem8 {
    public static void main(String[] args) {

        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take input for a number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define a maximum factor size and create an array for factors
        int maxFactor = 10;
        int[] factors = new int[maxFactor];
        int count = 0;

        // Loop through 1 to the number to find factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                // Resize array dynamically if needed
                if (count == maxFactor) {
                    maxFactor *= 2;
                    int[] newFactors = new int[maxFactor];
                    for (int j = 0; j < count; j++) {
                        newFactors[j] = factors[j];
                    }
                    factors = newFactors;
                }
                factors[count++] = i;
            }
        }

        // Display the factors of the number
        System.out.println("Factors of " + number + ":");
        for (int i = 0; i < count; i++) {
            System.out.print(factors[i] + " "); // Print each factor
        }

        // Close the scanner
        input.close();
    }
}
