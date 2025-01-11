import java.util.Scanner;

class Problem9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = input.nextInt();

        // Create arrays to store marks and performance data
        int[][] marks = new int[numberOfStudents][3]; // [Physics, Chemistry, Maths]
        Object[][] performance = new Object[numberOfStudents][2]; // [Percentage, Grade]

        // Input marks for each student
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");

            // Input marks for each subject
            for (int j = 0; j < 3; j++) {
                String subject = (j == 0) ? "Physics" : (j == 1) ? "Chemistry" : "Maths";

                do {
                    System.out.print("Enter marks in " + subject + " (0-100): ");
                    marks[i][j] = input.nextInt();
                    if (marks[i][j] < 0 || marks[i][j] > 100) {
                        System.out.println("Invalid marks! Please enter a value between 0 and 100.");
                    }
                } while (marks[i][j] < 0 || marks[i][j] > 100);
            }

            // Calculate percentage
            int totalMarks = marks[i][0] + marks[i][1] + marks[i][2];
            double percentage = totalMarks / 3.0;

            // Determine grade based on percentage
            char grade;
            if (percentage >= 80) {
                grade = 'A';
            } else if (percentage >= 70) {
                grade = 'B';
            } else if (percentage >= 60) {
                grade = 'C';
            } else if (percentage >= 50) {
                grade = 'D';
            } else if (percentage >= 40) {
                grade = 'E';
            } else {
                grade = 'R';
            }

            // Store percentage and grade in performance array
            performance[i][0] = percentage;
            performance[i][1] = grade;
        }

        // Display results
        System.out.println("Student  Physics  Chemistry  Maths  Percentage  Grade");
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println((i + 1) +"  " + marks[i][0] +"  " +  marks[i][1] +"  " +  marks[i][2] +"  " + performance[i][0] +"  " +  performance[i][1]);
        }
    }
}
