import java.util.Scanner;
public class Problem4{
	public static void main(String[] args){
		
	 // Create a Scanner object 
        Scanner input = new Scanner(System.in);

        // Get input
        int number = input.nextInt();

        // Initialize sum to store the sum of divisors
        int sumOfDivisors = 0;

        // Loop to find all divisors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
 
                sumOfDivisors += i;  // Add the divisor 
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sumOfDivisors > number) {
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }
	}
}