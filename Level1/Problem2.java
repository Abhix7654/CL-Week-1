
import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {

//Create scanner object
        Scanner input = new Scanner(System.in);

//Get input value
        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();
        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();
        System.out.print("Enter the third number: ");
        int number3 = input.nextInt();

        System.out.println("Is the first number the smallest? " + (number1 < number2 && number1 < number3));
    }
}