import java.util.Scanner;

class Problem18 {
    public static void main(String[] args) {

       //Create scanner object
        Scanner scanner = new Scanner(System.in);

        //Get input
        int number = scanner.nextInt();

        for (int i = 6; i <= 9; i++) {
            System.out.println(number + " * " + i + " = " + (number * i));
        }
    }
}

   