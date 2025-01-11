import java.util.Scanner;

class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define an array of 5 integers
        int[] numbers = new int[5];

        // Input numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = input.nextInt();
        }

        // Analyze each number
        for (int number : numbers) {
            if (number > 0) {
                System.out.println(number + " is positive and " + (number % 2 == 0 ? "even." : "odd."));
            } else if (number < 0) {
                System.out.println(number + " is negative.");
            } else {
                System.out.println(number + " is zero.");
            }
        }

        // Compare first and last elements
        if (numbers[0] > numbers[4]) {
            System.out.println("First element is greater than the last.");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("First element is less than the last.");
        } else {
            System.out.println("First and last elements are equal.");
        }

        input.close();
    }
}