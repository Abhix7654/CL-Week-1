import java.util.Scanner;
public class Problem2{
	public static void main(String[] args){
		
	  Scanner input = new Scanner(System.in);

        // Get number  input
        int number = input.nextInt();

        // Initialize counter
        int count = 0;

        // Loop to count digits
        while (number != 0) {
// Remove last digit
            number /= 10;  
// Increment the counter
            count++;  
        }

        // Print count of digit
        System.out.println("The number of digits is  " + count);

	
	}
}