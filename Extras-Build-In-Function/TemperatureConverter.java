import java.util.Scanner;

public class TemperatureConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean keepRunning = true;

        while (keepRunning) {
            // Display the menu
            System.out.println("\nTemperature Converter");
            System.out.println("1. Convert Fahrenheit to Celsius");
            System.out.println("2. Convert Celsius to Fahrenheit");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Convert Fahrenheit to Celsius
                    System.out.print("Enter temperature in Fahrenheit: ");
                    double fahrenheit = scanner.nextDouble();
                    double celsius = fahrenheitToCelsius(fahrenheit);
                    System.out.printf("Temperature in Celsius: %.2f°C\n", celsius);
                    break;

                case 2:
                    // Convert Celsius to Fahrenheit
                    System.out.print("Enter temperature in Celsius: ");
                    celsius = scanner.nextDouble();
                    fahrenheit = celsiusToFahrenheit(celsius);
                    System.out.printf("Temperature in Fahrenheit: %.2f°F\n", fahrenheit);
                    break;

                case 3:
                    // Exit the program
                    System.out.println("Exiting the program. Goodbye!");
                    keepRunning = false;
                    break;

                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }

    // Function to convert Fahrenheit to Celsius
    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Function to convert Celsius to Fahrenheit
    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
