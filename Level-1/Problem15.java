import java.util.Scanner;

public class Problem15{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input unit price and quantity
        System.out.print("Enter the unit price of the item: ");
        double unitPrice = input.nextDouble();

        System.out.print("Enter the quantity: ");
        int quantity = input.nextInt();

        // Calculate total price
        double totalPrice = unitPrice * quantity;

        // Output the result
        System.out.println("The total purchase price is INR " + totalPrice + 
                           " if the quantity is " + quantity + " and unit price is INR " + unitPrice);
    }
}
