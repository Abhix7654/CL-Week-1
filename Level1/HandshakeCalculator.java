import java.util.Scanner;
class HandshakeCalculator {

   // Method to calculate maximum handshakes
   public int calculateHandshakes(int numberOfStudents) {
      
      //(n * (n - 1)) / 2 formula
      return (numberOfStudents * (numberOfStudents - 1)) / 2;
   }

   public static void main(String[] args) {

      //Create class object
      HandshakeCalculator calculator = new HandshakeCalculator();

      Scanner input = new Scanner(System.in);

      // User input for number of students
      System.out.print("Enter the number of students: ");
      int numberOfStudents = input.nextInt();

      // Calculate and display handshakes
      int handshakes = calculator.calculateHandshakes(numberOfStudents);
      System.out.println("The maximum number of handshakes is: " + handshakes);
   }
}