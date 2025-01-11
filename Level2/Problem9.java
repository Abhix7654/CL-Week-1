
import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the three sides of the triangular park in meters");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
  
        //Adding all sides for perimeter
        double perimeter = side1 + side2 + side3;

        double rounds = perimeter/5000; //Converted 5km to 5000m

        System.out.println("The total number of rounds the athlete will run is " + (int) Math.ceil(rounds) + " to complete 5 km");
    }
}