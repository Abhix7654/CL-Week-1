
import java.util.Scanner;

class Problem3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        long number = input.nextInt();

        // Find and store digits in an array
        int maxDigit = 10;
        int[] digits = new int[maxDigit];
        int index = 0;

        while (number != 0) {
            if(index == maxDigit){
break;}

            digits[index++] = (int)number % 10;
            number /= 10;
        }

        // Find largest and second largest digits
        int largest = 0, secondLargest = 0;
        for (int i = 0; i < index; i++) {
            if (digits[i] > largest) {
                secondLargest = largest;
                largest = digits[i];
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i];
            }
        }

        // Display results
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);

        // Close the Scanner
        input.close();
    }
}

