import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

double a,b,c;

        Scanner input= new Scanner(System.in);
        System.out.println("Enter three double values a, b, and c:");
         a = input.nextDouble();
         b = input.nextDouble();
         c = input.nextDouble();


//Calculating Operations
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;

// Output the result
        System.out.println("The results of Double Operations are " + result1 + ", " + result2 + ", and " + result3);
    }
}