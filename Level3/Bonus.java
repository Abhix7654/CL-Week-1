import java.util.Random;

class Bonus {
    // Method to generate random salary and years of service for 10 employees
    public static double[][] generateEmployeeData() {
        double[][] employeeData = new double[10][2];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            // Generate random 5-digit salary
            double salary = random.nextInt(90000) + 10000;
            // Generate random years of service between 1 and 10
            double yearsOfService = random.nextInt(10) + 1;
            employeeData[i][0] = salary;
            employeeData[i][1] = yearsOfService;
        }
        return employeeData;
    }

    // Method to calculate new salary and bonus based on years of service
    public static double[][] calculateBonus(double[][] employeeData) {
        double[][] bonusData = new double[10][3];
        for (int i = 0; i < 10; i++) {
            double salary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus;
            if (yearsOfService > 5) {
                bonus = salary * 0.05;
            } else {
                bonus = salary * 0.02;
            }
            double newSalary = salary + bonus;
            bonusData[i][0] = salary;
            bonusData[i][1] = newSalary;
            bonusData[i][2] = bonus;
        }
        return bonusData;
    }

    // Method to calculate sum of old salary, new salary, and total bonus amount
    public static void calculateSums(double[][] bonusData) {
        double sumOldSalary = 0;
        double sumNewSalary = 0;
        double totalBonusAmount = 0;
        for (int i = 0; i < 10; i++) {
            sumOldSalary += bonusData[i][0];
            sumNewSalary += bonusData[i][1];
            totalBonusAmount += bonusData[i][2];
        }
        System.out.println("Sum of Old Salary: " + sumOldSalary);
        System.out.println("Sum of New Salary: " + sumNewSalary);
        System.out.println("Total Bonus Amount: " + totalBonusAmount);
    }

    // Method to display data in tabular format
    public static void displayData(double[][] bonusData) {
        System.out.println("Employee Data:");
        System.out.println("Old Salary\tNew Salary\tBonus");
        for (int i = 0; i < 10; i++) {
            System.out.println(bonusData[i][0] + "\t" + bonusData[i][1] + "\t" + bonusData[i][2]);
        }
    }

    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData();
        double[][] bonusData = calculateBonus(employeeData);
        displayData(bonusData);
        calculateSums(bonusData);
    }}
