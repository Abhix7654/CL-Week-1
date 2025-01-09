import java.util.Scanner;

class Problem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input distance in kilometers
        System.out.print("Enter distance in kilometers: ");
        double km = input.nextDouble();

        // Conversion factor
        double kmToMiles = 1.6;

        // Calculate distance in miles
        double miles = km / kmToMiles;

        // Output the result
        System.out.println("The total miles is " + miles + " miles for the given " + km + " km.");
    }
}
