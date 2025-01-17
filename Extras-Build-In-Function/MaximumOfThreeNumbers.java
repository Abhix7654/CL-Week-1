import java.util.Scanner;

public class MaximumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from the user for three numbers

        System.out.println("Enter the first number: ");
         int num1 = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Enter the third number: ");
        int num3 = scanner.nextInt();

        // Calculating the maximum value
        int max = findMaximum(num1, num2, num3);
        
        // Display the result
        System.out.println("The maximum value is: " + max);
    }

 
    // Function to calculate the maximum of three numbers
    private static int findMaximum(int num1, int num2, int num3) {
        int max = num1;  // Assume num1 is the maximum

        if (num2 > max) {
            max = num2;  // If num2 is greater than max, update max
        }

        if (num3 > max) {
            max = num3;  // If num3 is greater than max, update max
        }

        return max;
    }
}
