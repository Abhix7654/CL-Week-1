import java.util.Scanner;
public class Problem6{
	public static void main(String[] args){
		
	 // Create a Scanner
        Scanner input = new Scanner(System.in);

        // Get number1 as input
        System.out.print("Enter first number ");
        double first = input.nextDouble();

        // Get number2 as input
        System.out.print("Enter second number  ");
        double second = input.nextDouble();

        // Get number3 as input
        System.out.print("Enter an operator (+, -, *, /)  ");
        String operator = input.next();

        // Perform the operation using switch statement
        switch (operator) {
	//Addition operation
            case "+":
                System.out.println("Result: " + (first + second));
                break;
	//Subtraction operation
            case "-":
                System.out.println("Result: " + (first - second));
                break;
	//Multiplication operation 
            case "*":
                System.out.println("Result: " + (first * second));
                break;
	//Division operation
            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }

	}
}