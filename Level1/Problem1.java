import java.util.Scanner;

class Problem1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Define an array of 10 integers to store ages
        int[] ages = new int[10];

        // Input ages
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = input.nextInt();
        }

        // Check voting eligibility for each age
        for (int age : ages) {
            if (age < 0) {
                System.out.println("Invalid age.");
            } else if (age >= 18) {
                System.out.println("The student with age " + age + " can vote.");
            } else {
                System.out.println("The student with age " + age + " cannot vote.");
            }
        }

        input.close();
    }
}