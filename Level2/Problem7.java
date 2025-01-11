import java.util.Scanner;

public class Problem7{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Get Input weight and height
        System.out.print("Enter weight in kg: ");
        double weight = input.nextDouble();
        System.out.print("Enter height in cm: ");
        double heightCm = input.nextDouble();

        // Convert height to meters
        double heightM = heightCm / 100;

        // Calculate BMI = weight / (height * height)
        double bmi = weight / (heightM * heightM);

        // Check weight status
        if (bmi <= 18.4) {
            System.out.println("Underweight");
        } else if (bmi <=  24.9) {
            System.out.println("Normal weight");
        } else if (bmi <= 39.9) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }
}
