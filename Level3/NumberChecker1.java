import java.util.Arrays;
import java.util.Scanner;

class NumberChecker1{

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to find the sum of the digits of a number using the digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number using the digits array
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number using a digits array
    public static boolean isHarshadNumber(int[] digits) {
        int sum = sumOfDigits(digits);
        int originalNumber = 0;
        for (int digit : digits) {
            originalNumber = originalNumber * 10 + digit;
        }
        return originalNumber % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2];
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i;
        }
        for (int digit : digits) {
            frequency[digit][1]++;
        }
        return frequency;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        int[] digits = storeDigits(number);

        // Call the different methods and display results
        System.out.println("Count of digits: " + countDigits(number));
        System.out.println("Digits array: " + Arrays.toString(digits));
        System.out.println("Sum of digits: " + sumOfDigits(digits));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad number: " + isHarshadNumber(digits));
        
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit frequency:");
        for (int[] freq : frequency) {
            if (freq[1] > 0) {
                System.out.println("Digit " + freq[0] + ": " + freq[1]);
            }
        }
    }
}
