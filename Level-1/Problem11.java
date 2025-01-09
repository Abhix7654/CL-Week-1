import java.util.Scanner;

class Problem11{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter first number: ");
        double number1 = input.nextDouble();

        System.out.print("Enter second number: ");
        double number2 = input.nextDouble();

        // Perform calculations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = number1 / number2;

        // Output the results
        System.out.println("The addition, subtraction, multiplication, and division values of numbers " 
                           + number1 + " and " + number2 + " are " + addition + ", " + subtraction + 
                           ", " + multiplication + ", and " + division);
    }
}
