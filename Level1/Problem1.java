import java.util.Scanner;

class Problem1 {
    public static void main(String[] args) {

      // Create a Scanner Object
 Scanner input = new Scanner(System.in);

    
  // Get input value for number
   int number = input.nextInt();

        System.out.println("Is the number " + number + " divisible by 5? " + (number % 5 == 0));
    }
}