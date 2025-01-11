import  java.util.Scanner;

class NumberChecker {

   // Method to check the number
   public int checkNumber(int number) {
      if (number > 0) return 1;
      else if (number < 0) return -1;
      else return 0;
   }

   public static void main(String[] args) {
      //Create class obj
      NumberChecker checker = new NumberChecker();

      // User input
      Scanner input = new Scanner(System.in);
      System.out.print("Enter a number: ");
      int number = input.nextInt();

      // Check and display result
      int result = checker.checkNumber(number);
      if (result == 1) System.out.println("The number is positive.");
      else if (result == -1) System.out.println("The number is negative.");
      else System.out.println("The number is zero.");
   }
}