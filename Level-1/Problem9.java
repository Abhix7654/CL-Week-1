import java.util.Scanner;

class Problem9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input fee and discount percentage
        System.out.print("Enter the course fee: ");
        double fee = input.nextDouble();

        System.out.print("Enter the discount percentage: ");
        double discountPercent = input.nextDouble();

        // Calculate discount and final fee
        double discount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discount;

        // Output the result
        System.out.println("The discount amount is INR " + discount + 
                           " and final discounted fee is INR " + finalFee);
    }
}
