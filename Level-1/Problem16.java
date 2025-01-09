import java.util.Scanner;

public class Problem16{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        // Calculate maximum handshakes
        int handshakes = (n * (n - 1)) / 2;

        // Output the result
        System.out.println("The maximum number of handshakes among " + n + " students is " + handshakes);
    }
}
