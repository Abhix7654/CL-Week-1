import java.util.Scanner;

class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define arrays for salaries, years of service, bonuses, and new salaries
        double[] salaries = new double[10];
        double[] yearsOfService = new double[10];
        double[] bonuses = new double[10];
        double[] newSalaries = new double[10];

        // Define variables for total bonus, old salary, and new salary
        double totalBonus = 0, totalOldSalary = 0, totalNewSalary = 0;

        // Input salaries and years of service
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter salary for employee " + (i + 1) + ": ");
            salaries[i] = input.nextDouble();

            System.out.print("Enter years of service for employee " + (i + 1) + ": ");
            yearsOfService[i] = input.nextDouble();

            // Validate input
            if (salaries[i] < 0 || yearsOfService[i] < 0) {
                System.err.println("Invalid input. Please enter positive values.");
                i--; // Retry input for the current employee
                continue;
            }
        }

        // Calculate bonuses and new salaries
        for (int i = 0; i < 10; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05;
            } else {
                bonuses[i] = salaries[i] * 0.02;
            }

            newSalaries[i] = salaries[i] + bonuses[i];

            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }

        // Display results
        System.out.println("Total Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);

        // Close the Scanner
        input.close();
    }
}