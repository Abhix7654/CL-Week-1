import java.util.Scanner;

class Problem7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        if (number <= 0) {
            System.err.println("Error: Not a natural number.");
            System.exit(0);
        }

        // Arrays for odd and even numbers
        int[] evens = new int[number / 2 + 1];
        int[] odds = new int[number / 2 + 1];
        int evenIndex = 0, oddIndex = 0;

        // Populate arrays
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                evens[evenIndex++] = i;
            } else {
                odds[oddIndex++] = i;
            }
        }

        // Display results
        System.out.println("Even numbers:");
        for (int i = 0; i < evenIndex; i++) {
            System.out.print(evens[i] + " ");
        }
        System.out.println("\nOdd numbers:");
        for (int i = 0; i < oddIndex; i++) {
            System.out.print(odds[i] + " ");
        }

        input.close();
    }
}