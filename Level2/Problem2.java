import java.util.Scanner;

class Problem2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define arrays for ages and heights
        int[] ages = new int[3];
        int[] heights = new int[3];

        // Input ages and heights
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of friend " + (i + 1) + ": ");
            ages[i] = input.nextInt();

            System.out.print("Enter height of friend " + (i + 1)  );
            heights[i] = input.nextInt();
        }

        // Find youngest and tallest
        int youngestIndex = 0;
        int tallestIndex = 0;

        for (int i = 1; i < 3; i++) {
            if (ages[i] < ages[youngestIndex]) {
                youngestIndex = i;
            }
            if (heights[i] > heights[tallestIndex]) {
                tallestIndex = i;
            }
        }

        // Display results
        System.out.println("Youngest Friend: Friend " + (youngestIndex + 1) + " (Age: " + ages[youngestIndex] + ")");
        System.out.println("Tallest Friend: Friend " + (tallestIndex + 1) +  " Height: " + heights[tallestIndex]);

        // Close the Scanner
        input.close();
    }
}