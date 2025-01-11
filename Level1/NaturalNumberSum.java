import  java.util.Scanner;

class NaturalNumberSum {

   // Method to find the sum of N natural numbers
   public int findSum(int n) {
      int sum = 0;
      for (int i = 1; i <= n; i++) {
         sum += i;
      }
      return sum;
   }

   public static void main(String[] args) {
      NaturalNumberSum calculator = new NaturalNumberSum();

      // User input for N
  Scanner input = new Scanner(System.in);
      System.out.print("Enter a number N: ");
      int n = input.nextInt();

      // Calculate and display the sum
      int sum = calculator.findSum(n);
      System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
   }
}