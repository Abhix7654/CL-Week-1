import java.util.Scanner;

class Problem9{
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Take input for rows and columns
        System.out.print("Enter number of rows: ");
        int rows = input.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = input.nextInt();

        // Create a 2D array (Matrix) and take user input for each element
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter elements of the 2D array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        // Create a 1D array to copy the elements from the 2D array
        int[] singleArray = new int[rows * cols];
        int index = 0;

        // Loop through the 2D array and copy its elements to the 1D array
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                singleArray[index++] = matrix[i][j];
            }
        }

        // Print the 1D array
        System.out.print("1D Array: ");
        for (int value : singleArray) {
            System.out.print(value + " ");
        }

        // Close the Scanner Object
        input.close();
    }
}
