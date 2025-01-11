import  java.util.Scanner;

class ChocolateDivider {

   // Method to find chocolates per child and remaining chocolates
   public static int[] divideChocolates(int numberOfChocolates, int numberOfChildren) {
      int chocolatesPerChild = numberOfChocolates / numberOfChildren;
      int remainingChocolates = numberOfChocolates % numberOfChildren;
      return new int[] { chocolatesPerChild, remainingChocolates };
   }

   public static void main(String[] args) {

      // User input for chocolates and children
   Scanner input = new Scanner(System.in);
      System.out.print("Enter the number of chocolates: ");
      int numberOfChocolates = input.nextInt();
      System.out.print("Enter the number of children: ");
      int numberOfChildren = input.nextInt();

      // Calculate and display division results
      int[] result = divideChocolates(numberOfChocolates, numberOfChildren);
      System.out.println("Each child gets: " + result[0] + " chocolates");
      System.out.println("Remaining chocolates: " + result[1]);
   }
}