
import java.util.Scanner;

class Problem14 {
    public static void main(String[] args) {

      //Create scanner object
        Scanner input = new Scanner(System.in);
      
       //Get input
        int n = input.nextInt();

        if (n >= 0) {
            long factorial = 1;//create variable
            int i = 1;
           
          //multiply using while loop
            while (i <= n) {
                factorial *= i;
                i++;
            }
            System.out.println("The factorial of " + n + " is " + factorial);
        } else {
            System.out.println("The number " + n + " is not a positive integer.");
        }
    }
}