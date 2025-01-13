import java.util.Scanner;
class CollinearityChecker {

    public static boolean areCollinearSlope(int x1, int y1, int x2, int y2, int x3, int y3) {
        double slopeAB = (double) (y2 - y1) / (x2 - x1);
        double slopeBC = (double) (y3 - y2) / (x3 - x2);
        double slopeAC = (double) (y3 - y1) / (x3 - x1);

        return slopeAB == slopeBC && slopeBC == slopeAC;
    }

    public static boolean areCollinearArea(int x1, int y1, int x2, int y2, int x3, int y3) {
        double area = 0.5 * Math.abs(x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        return area == 0;
    }

    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("enter value  for x1 and y1");
        int x1 = sc.nextInt(), y1 = sc.nextInt();
System.out.println("enter value  for x2 and y2");

        int x2 = sc.nextInt(), y2 = sc.nextInt();
System.out.println("enter value  for x3 and y3");

        int x3 = sc.nextInt(), y3 =sc.nextInt();

        if (areCollinearSlope(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points A, B, and C are collinear using the slope formula.");
        } else {
            System.out.println("The points A, B, and C are not collinear using the slope formula.");
        }

        if (areCollinearArea(x1, y1, x2, y2, x3, y3)) {
            System.out.println("The points A, B, and C are collinear using the area of the triangle formula.");
        } else {
            System.out.println("The points A, B, and C are not collinear using the area of the triangle formula.");
        }
    }
}
