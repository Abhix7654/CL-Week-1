public class Problem6 {
    public static void main(String[] args) {

        // Initializing the fee and discount percentage
        int fee = 125000;
        int discountPercent = 10;

        // Calculate discount amount and final fee
        double discount = (fee * discountPercent) / 100.0;
        double finalFee = fee - discount;

        // Output the result
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
    }
}
