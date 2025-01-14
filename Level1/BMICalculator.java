import java.util.Scanner;

class BMICalculator {

    // Method to calculate BMI
    public static double calculateBMI(double weight, double heightInCm) {
        double heightInMeters = heightInCm / 100; // Convert height from cm to meters
        return weight / (heightInMeters * heightInMeters); // BMI formula
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi <= 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    // Method to process BMI data and store results in a 2D String array
    public static String[][] processBMIData(double[][] data) {
        String[][] results = new String[data.length][4];
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double height = data[i][1];
            double bmi = calculateBMI(weight, height);
            String status = getBMIStatus(bmi);

            results[i][0] = String.valueOf(weight);
            results[i][1] = String.valueOf(height);
            results[i][2] = String.format("%.2f", bmi); // Format BMI to 2 decimal places
            results[i][3] = status;
        }
        return results;
    }

    // Main method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] data = new double[10][2]; // Array to store weight and height for 10 members

        // Input weight and height for each person
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter weight (in kg) for person " + (i + 1) + ": ");
            data[i][0] = scanner.nextDouble();
            System.out.println("Enter height (in cm) for person " + (i + 1) + ": ");
            data[i][1] = scanner.nextDouble();
        }

        // Process BMI data
        String[][] bmiResults = processBMIData(data);

        // Display the results
        System.out.println("\nResults:");
        System.out.println("Weight (kg)\tHeight (cm)\tBMI\t\tStatus");
        for (String[] result : bmiResults) {
            System.out.println(result[0] + "\t\t" + result[1] + "\t\t" + result[2] + "\t" + result[3]);
        }

        scanner.close();
    }
}
