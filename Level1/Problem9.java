import java.util.Scanner;

public class Problem9 {
    public static void main(String[] args) {

      //Create scanner object
        Scanner input = new Scanner(System.in);

       //Get input
        int start = input.nextInt();

       //Decrement no
        for (int i = start; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Rocket Launch");
    }
}