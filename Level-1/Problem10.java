import java.util.Scanner;

public class Problem10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input height in cm
        System.out.print("Enter your height in centimeters: ");
        double heightCm = input.nextDouble();

        // Conversion factors
        double cmToInches = 2.54;
        double inchesToFeet = 12;

        // Convert to inches and feet
        double totalInches = heightCm / cmToInches;
        int feet = (int) (totalInches / inchesToFeet);
        double inches = totalInches % inchesToFeet;

        // Output the result
        System.out.println("Your Height in cm is " + heightCm + 
                           " while in feet is " + feet + " and inches is " + inches);
    }
}
