import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
int a,b,c;
        Scanner input = new Scanner(System.in);

//Take input
        System.out.println("Enter three integers a, b, and c:");
         a = input.nextInt();
         b = input.nextInt();
         c = input.nextInt();

        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

//Output Result
        System.out.println("The results of Int Operations are " + result1 + ", " + result2 + ", " + result3 + ", " + result4);
    }
}
