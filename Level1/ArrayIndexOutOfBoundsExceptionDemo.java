import java.util.Scanner;

class ArrayIndexOutOfBoundsExceptionDemo {

   // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Accessing array element at invalid index...");
            System.out.println(names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input array and index
        System.out.print("Enter number of names: ");
        int n = scanner.nextInt();
        String[] names = new String[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            names[i] = scanner.next();
        }
        System.out.print("Enter index to access: ");
        int index = scanner.nextInt();

        // Generate and handle exception
        handleException(names, index);
    }
}
