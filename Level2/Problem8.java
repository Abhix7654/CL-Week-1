import java.util.Scanner;

class Problem8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Create arrays to store marks, percentages, and grades
        int[] physicsMarks = new int[numberOfStudents];
        int[] chemistryMarks = new int[numberOfStudents];
        int[] mathsMarks = new int[numberOfStudents];
        double[] percentages = new double[numberOfStudents];
        char[] grades = new char[numberOfStudents];

        // Input marks and calculate performance for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            // Input Physics marks
            do {
                System.out.print("Enter marks in Physics (0-100): ");
                physicsMarks[i] = input.nextInt();
                if (physicsMarks[i] < 0 || physicsMarks[i] > 100) {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                }
            } while (physicsMarks[i] < 0 || physicsMarks[i] > 100);

            // Input Chemistry marks
            do {
                System.out.print("Enter marks in Chemistry (0-100): ");
                chemistryMarks[i] = input.nextInt();
                if (chemistryMarks[i] < 0 || chemistryMarks[i] > 100) {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                }
            } while (chemistryMarks[i] < 0 || chemistryMarks[i] > 100);

            // Input Maths marks
            do {
                System.out.print("Enter marks in Maths (0-100): ");
                mathsMarks[i] = input.nextInt();
                if (mathsMarks[i] < 0 || mathsMarks[i] > 100) {
                    System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                }
            } while (mathsMarks[i] < 0 || mathsMarks[i] > 100);

            // Calculate percentage
            int totalMarks = physicsMarks[i] + chemistryMarks[i] + mathsMarks[i];
            percentages[i] = totalMarks / 3.0;

            // Determine grade based on percentage
            if (percentages[i] >= 80) {
                grades[i] = 'A';
            } else if (percentages[i] >= 70) {
                grades[i] = 'B';
            } else if (percentages[i] >= 60) {
                grades[i] = 'C';
            } else if (percentages[i] >= 50) {
                grades[i] = 'D';
            } else if (percentages[i] >= 40) {
                grades[i] = 'E';
            } else {
                grades[i] = 'R';
            }
        }

        // Display results
        System.out.println("Student  Physics  Chemistry  Maths  Percentage  Grade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println((i + 1) + "    " + physicsMarks[i]+ "    " + chemistryMarks[i]+ "    " + mathsMarks[i]+ "    " + percentages[i]+ "    " + grades[i]);
        }
    }
}
