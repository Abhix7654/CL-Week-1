import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

       //Take input
        System.out.println("Enter temperature in Fahrenheit:");
        double fahrenheit = input.nextDouble();
       
        //formulae to convert Fahrenheit to Celsius:   (°F − 32) x 5/9 = °C 
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsius + " Celsius");
    }
}