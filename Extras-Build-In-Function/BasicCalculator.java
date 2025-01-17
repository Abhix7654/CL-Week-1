import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            // Display the menu
            System.out.println("\nBasic Calculator");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            // Perform the selected operation
            switch (choice) {
                case 1:
                    performOperation(scanner, "addition");
                    break;

                case 2:
                    performOperation(scanner, "subtraction");
                    break;

                case 3:
                    performOperation(scanner, "multiplication");
                    break;

                case 4:
                    performOperation(scanner, "division");
                    break;

                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    keepRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please choose a valid option.");
            }
        }
    }

    // Perform the selected operation
    private static void performOperation(Scanner scanner, String operation) {
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        switch (operation) {
            case "addition":
                System.out.printf("Result: %.2f\n", add(num1, num2));
                break;

            case "subtraction":
                System.out.printf("Result: %.2f\n", subtract(num1, num2));
                break;

            case "multiplication":
                System.out.printf("Result: %.2f\n", multiply(num1, num2));
                break;

            case "division":
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    System.out.printf("Result: %.2f\n", divide(num1, num2));
                }
                break;
        }
    }

    // Function for addition
    private static double add(double a, double b) {
        return a + b;
    }

    // Function for subtraction
    private static double subtract(double a, double b) {
        return a - b;
    }

    // Function for multiplication
    private static double multiply(double a, double b) {
        return a * b;
    }

    // Function for division
    private static double divide(double a, double b) {
        return a / b;
    }
}
