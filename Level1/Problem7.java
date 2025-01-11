import java.util.Scanner;

public class Problem7 {
    public static void main(String[] args) {

      //Create scanner object
        Scanner input = new Scanner(System.in);
      
     //Get month input
        int month = input.nextInt();
        int day = input.nextInt();

//Spring Season is from March 20 to June 20
        if ((month == 3 && day >= 20) || (month == 6 && day <= 20) || (month > 3 && month < 6)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }
}