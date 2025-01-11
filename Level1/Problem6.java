import java.util.Scanner;

class Problem6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array for heights
        double[] heights = new double[11];
        double total = 0.0;

        // Input heights
        for (int i = 0; i < heights.length; i++) {
            System.out.print("Enter height of player " + (i + 1) + ": ");
            heights[i] = input.nextDouble();
            total += heights[i];
        }

        // Calculate mean = sum of all elements / number of elements

        double mean = total / heights.length;
        System.out.println("Mean height: " + mean);

        input.close();
    }
}