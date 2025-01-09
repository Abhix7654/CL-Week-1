import java.util.Scanner;

class Problem12{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input base and height
        System.out.print("Enter the base of the triangle in cm: ");
        double base = input.nextDouble();

        System.out.print("Enter the height of the triangle in cm: ");
        double height = input.nextDouble();

        // Calculate area in cm^2
        double areaCm2 = 0.5 * base * height;

        // Convert to square inches (1 cm^2 = 0.155 square inches)
        double areaInches2 = areaCm2 * 0.155;

        // Output the results
        System.out.println("The area of the triangle is " + areaCm2 + " cm^2 and " + areaInches2 + " square inches.");
    }
}
