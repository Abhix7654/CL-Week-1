import java.util.Scanner;

class SimpleInterestCalculator {

   // Method to calculate Simple Interest
   public double calculateSimpleInterest(double principal, double rate, double time) {
      return (principal * rate * time) / 100;
   }

   public static void main(String[] args) {

          // create object of class
         SimpleInterestCalculator calculator = new SimpleInterestCalculator();

       //Create scanner object
       Scanner input = new Scanner(System.in);

      // Get inputs for Principal, Rate, and Time
      
      System.out.print("Enter Principal, Rate and Time ");

      double principal = input.nextDouble();

      double rate = input.nextDouble();

      double time = input.nextDouble();

      // Calculate and display Simple Interest
      double interest = calculator.calculateSimpleInterest(principal, rate, time);
      System.out.println("The Simple Interest is " + interest + " for Principal " + principal + ", Rate of Interest " + rate + ", and Time " + time);
   }
}