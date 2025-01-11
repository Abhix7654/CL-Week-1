import java.util.Scanner;

public class Problem3{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input marks for Physics, Chemistry, and Maths

        System.out.println("Physics, Chemistry, and Maths ");
        int physics = input.nextInt();
        int chemistry = input.nextInt();
        int maths = input.nextInt();

        // Calculate total and percentage
        int totalMarks = physics + chemistry + maths;
        double averageMarks = totalMarks / 3.0;
         

        // Create grade and remark variable 
        String grade,remark;


        if (averageMarks >= 80) {
            grade = "A";
           remark="Abobe agency-normalized standars";
        } else if (averageMarks >= 70 && averageMarks <=79) {
            grade = "B";
           remark="at Agency-normalized standars";
        } else if (averageMarks >= 60 && averageMarks <=69) {
            grade = "C";
           remark="below but approaching  agency-normalized standards";
        } else if (averageMarks >= 50 && averageMarks <=59) {
            grade = "D";
           remark="well below agency-normalized standards";
        } else if (averageMarks >= 40 && averageMarks <=49) {
            grade = "E";
           remark="too below agency-normalized standards";
        } else {
            grade = "R";
            remark="Remedial standards";
        }

        // Print results
        System.out.println("Average Marks: " + averageMarks);
        System.out.println("Grade: " + grade);
        System.out.println("Grade: " + remark);


    }
}