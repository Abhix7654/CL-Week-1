import java.util.Scanner;

public class GCDandLCMCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking two inputs from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculating the GCD using the GCD function
        int gcd = calculateGCD(num1, num2);

        // Calculating the LCM using the LCM function
        int lcm = calculateLCM(num1, num2, gcd);

        // Displaying the results
        System.out.println("Greatest Common Divisor (GCD) of " + num1 + " and " + num2 + " is: " + gcd);
        System.out.println("Least Common Multiple (LCM) of " + num1 + " and " + num2 + " is: " + lcm);
    }

    // Function to calculate the Greatest Common Divisor (GCD) using Euclid's Algorithm
    private static int calculateGCD(int a, int b) {
        // Applying Euclid's algorithm to find GCD
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Function to calculate the Least Common Multiple (LCM)
    private static int calculateLCM(int a, int b, int gcd) {
        // Using the formula LCM(a, b) = (a * b) / GCD(a, b)
        return (a * b) / gcd;
    }
}
