import  java.util.Scanner;

class QuotientAndRemainder {

   // Method to find quotient and remainder
   public static int[] findQuotientAndRemainder(int number, int divisor) {
      int quotient = number / divisor;
      int remainder = number % divisor;
      return new int[] { quotient, remainder };
   }

   public static void main(String[] args) {

      // User input for number and divisor
     Scanner input = new Scanner(System.in);
      System.out.print("Enter the number: ");
      int number = input.nextInt();
      System.out.print("Enter the divisor: ");
      int divisor = input.nextInt();

      // Calculate and display quotient and remainder
      int[] result = findQuotientAndRemainder(number, divisor);
      System.out.println("Quotient: " + result[0]);
      System.out.println("Remainder: " + result[1]);
   }
}