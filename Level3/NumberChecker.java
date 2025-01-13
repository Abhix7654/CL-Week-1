import java.util.*;

class NumberChecker{

    // Method to count the number of digits in the given number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method to store each digit of the given number in an array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // Method to check if the number is a Duck number
    // (A Duck number is a number that has zero in it, but not at the starting position)
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if the number is an Armstrong number
    // (An Armstrong number is a number that is equal to the sum of its own digits each raised to the power of the number of digits)
    public static boolean isArmstrongNumber(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += (int) Math.pow(digit, digits.length);
        }
        int originalNumber = 0;
        for (int digit : digits) {
            originalNumber = originalNumber * 10 + digit;
        }
        return sum == originalNumber;
    }

    // Method to find the largest and second largest digits in the array
    public static int[] findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        return new int[] { largest, secondLargest };
    }

    // Method to find the smallest and second smallest digits in the array
    public static int[] findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        return new int[] { smallest, secondSmallest };
    }

    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int[] digits = storeDigits(number);

        // Display the count of digits
        System.out.println("Count of digits: " + countDigits(number));

        // Display whether the number is a Duck number
        System.out.println("Is Duck number: " + isDuckNumber(digits));

        // Display whether the number is an Armstrong number
        System.out.println("Is Armstrong number: " + isArmstrongNumber(digits));

        // Display the largest and second largest digits
        int[] largestAndSecondLargest = findLargestAndSecondLargest(digits);
        System.out.println("Largest digit: " + largestAndSecondLargest[0]);
        System.out.println("Second largest digit: " + largestAndSecondLargest[1]);
    }
}
