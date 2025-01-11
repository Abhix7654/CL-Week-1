import java.util.Scanner;

class Problem12 {
    public static void main(String[] args) {
        // Create scanner object
        Scanner input = new Scanner(System.in);

        // Input the number
        System.out.println("Enter a number: ");
        int number = input.nextInt();

        System.out.println("Multiples of " + number + " below 100:");

        // Print multiples
        for (int i = 100; i >= 1; i--) { 
            if (i % number == 0) {
                System.out.println(i);
            }
        }
    }
}
