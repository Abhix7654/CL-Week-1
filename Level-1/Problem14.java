import java.util.Scanner;

class Problem14{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input distance in feet
        System.out.print("Enter the distance in feet: ");
        double feet = input.nextDouble();

        // Conversion factors
        double feetToYards = 1.0 / 3;
        double feetToMiles = 1.0 / 5280;

        // Convert to yards and miles
        double yards = feet * feetToYards;
        double miles = feet * feetToMiles;

        // Output the result
        System.out.println("The distance is " + yards + " yards and " + miles + " miles for " + feet + " feet.");
    }
}
