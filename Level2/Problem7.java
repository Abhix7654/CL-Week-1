import java.util.Scanner;

public class Problem7{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//Takes input of two no:
        System.out.println("Enter two numbers-");
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        int temp = number1; //Temporary variable to store value
        number1 = number2;
        number2 = temp;


        System.out.println("The swapped numbers are " + number1 + " and " + number2);
    }
}
