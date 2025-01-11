import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {

        // Create Scanner object
        Scanner input = new Scanner(System.in);

        // Input month, day, and year
        System.out.println("Enter the month (1 for January, 2 for February, ...): ");
        int m = input.nextInt();

        System.out.println("Enter the day: ");
        int d = input.nextInt();

        System.out.println("Enter the year: ");
        int y = input.nextInt();

        // Apply the formulas
        int y0 = y - (14 - m) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = m + 12 * ((14 - m) / 12) - 2;
        int d0 = (d + x + (31 * m0) / 12) % 7;

        // Print the result
        System.out.println("Day of the week (0=Sunday, 1=Monday, ...): " + d0);

    
    }
}
