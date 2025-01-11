import java.util.Scanner;

class Problem4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array and variables
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Input loop
        while (index < 10) {
            System.out.print("Enter a number: ");
            double num = input.nextDouble();

            if (num <= 0) {
                break; // Stop on 0 or negative
            }

            numbers[index] = num;
            total += num;
            index++;
        }

        // Display results
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nTotal: " + total);

        input.close();
    }
}