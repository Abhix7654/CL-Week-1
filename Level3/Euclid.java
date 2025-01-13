import java.util.Scanner;
public class Euclid {
    // Method to find the Euclidean distance between two points
    public static double findDistance(double x1, double y1, double x2, double y2) {
        // Calculate the difference in x and y coordinates
        double dx = x2 - x1;
        double dy = y2 - y1;
        
        // Calculate the Euclidean distance using the formula
        double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));
        
        return distance;
    }

    // Method to find the equation of a line given two points
    public static double[] findEquation(double x1, double y1, double x2, double y2) {
        // Calculate the slope using the formula
        double m = (y2 - y1) / (x2 - x1);
        
        // Calculate the y-intercept using the formula
        double b = y1 - m * x1;
        
        // Return an array containing the slope and y-intercept
        return new double[] {m, b};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the coordinates of the two points
        System.out.print("Enter the x-coordinate of the first point: ");
        double x1 = scanner.nextDouble();
        
        System.out.print("Enter the y-coordinate of the first point: ");
        double y1 = scanner.nextDouble();
        
        System.out.print("Enter the x-coordinate of the second point: ");
        double x2 = scanner.nextDouble();
        
        System.out.print("Enter the y-coordinate of the second point: ");
        double y2 = scanner.nextDouble();
        
        // Find the Euclidean distance between the two points
        double distance = findDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance: " + distance);
        
        // Find the equation of the line
        double[] equation = findEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: y = " + equation[0] + "x + " + equation[1]);
    }
}
