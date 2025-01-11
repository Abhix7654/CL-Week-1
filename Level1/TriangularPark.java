import  java.util.Scanner;
class TriangularPark {

   // Method to calculate the number of rounds needed
   public int calculateRounds(double side1, double side2, double side3, double distance) {
      double perimeter = side1 + side2 + side3;
      return (int) Math.ceil(distance / perimeter); // Round up to complete the distance
   }

   public static void main(String[] args) {

      //Create class object
     TriangularPark park = new TriangularPark();

      //Create scanner object
      Scanner input = new Scanner(System.in);

      // User input for the three sides of the triangle
      System.out.print("Enter side 1: ");
      double side1 = input.nextDouble();
      System.out.print("Enter side 2: ");
      double side2 = input.nextDouble();
      System.out.print("Enter side 3: ");
      double side3 = input.nextDouble();

      // Calculate and display rounds
      int rounds = park.calculateRounds(side1, side2, side3, 5000); // 5000 meters = 5 km
      System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");
   }
}