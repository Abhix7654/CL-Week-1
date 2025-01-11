
import java.util.Scanner;

public class Problem4{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

//Takes input
        System.out.println("Enter temperature in Celsius:");
        double celsius = input.nextDouble();

       //Formulae Celsius to Fahrenheit:   (°C × 9/5) + 32 = °F
        double fahrenheit = (celsius * 9/5) + 32;

// Output the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheit + " Fahrenheit");
    }
}