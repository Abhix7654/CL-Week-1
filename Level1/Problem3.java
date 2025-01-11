import java.util.Scanner;

class Problem3 {
    public static void main(String[] args) {
//Create scanner object
        Scanner scanner = new Scanner(System.in);

//Get input number
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();

        System.out.println("Is the first number the largest? " + (number1 > number2 && number1 > number3));
        System.out.println("Is the second number the largest? " + (number2 > number1 && number2 > number3));
        System.out.println("Is the third number the largest? " + (number3 > number1 && number3 > number2));
    }
}