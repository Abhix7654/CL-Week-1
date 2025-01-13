import java.util.Random;
import java.util.Scanner;

class Percent {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Maths
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // Array to store scores for Physics, Chemistry, and Maths
        
        for (int i = 0; i < numStudents; i++) {
            scores[i][0] = random.nextInt(90) + 10; // Generate a random score between 10 and 99 for Physics
            scores[i][1] = random.nextInt(90) + 10; // Generate a random score between 10 and 99 for Chemistry
            scores[i][2] = random.nextInt(90) + 10; // Generate a random score between 10 and 99 for Maths
        }
        
        return scores;
    }

    // Method to calculate the total, average, and percentage for each student
    public static double[][] calculateTotalAveragePercentage(int[][] scores, int numStudents) {
        double[][] results = new double[numStudents][4]; // Array to store total, average, percentage for each student

        for (int i = 0; i < numStudents; i++) {
            double total = scores[i][0] + scores[i][1] + scores[i][2]; // Total marks
            double average = total / 3; // Average marks
            double percentage = (total / 300) * 100; // Percentage calculation

            // Round off the values to 2 decimal places
            results[i][0] = Math.round(total * 100.0) / 100.0;
            results[i][1] = Math.round(average * 100.0) / 100.0;
            results[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return results;
    }

    // Method to display the scorecard of all students
    public static void displayScoreCard(int[][] scores, double[][] results, int numStudents) {
        System.out.println("Student No.\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("---------------------------------------------------------------");
        
        for (int i = 0; i < numStudents; i++) {
            System.out.print((i + 1) + "\t\t");
            System.out.print(scores[i][0] + "\t\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t\t");
            System.out.print(results[i][0] + "\t" + results[i][1] + "\t\t" + results[i][2] + "%");
            System.out.println();
        }
    }

    // Method to calculate and display the results
    public static void displayResults(int numStudents) {
        // Generate random scores for all students
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, and percentage for each student
        double[][] results = calculateTotalAveragePercentage(scores, numStudents);

        // Display the scorecard of all students
        displayScoreCard(scores, results, numStudents);
    }

    public static void main(String[] args) {
        // Create a new Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter the number of students
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        // Display the results for all students
        displayResults(numStudents);

        // Close the scanner object
        scanner.close();
    }
}
