
import java.util.Scanner;

public class Problem12 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter weight in pounds:");
        double pounds = input.nextDouble();

        //1 pound = 2.2 kg
        double kilograms = pounds*2.2;

        System.out.println("The weight of the person in pounds is " + pounds + " and in kg is " + kilograms);
    }
}



