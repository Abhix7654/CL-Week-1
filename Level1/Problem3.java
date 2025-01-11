import java.util.Scanner;

class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Define an array to store the results
        int[] table = new int[10];

        // Populate the multiplication table
        for (int i = 0; i < 10; i++) {
            table[i] = number * (i + 1);
        }

        // Display the multiplication table
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + table[i]);
        }

        input.close();
    }
}