import java.util.Scanner;

public class Problem10{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of chocolates-");
        int chocolates = input.nextInt();

       System.out.println("Enter the number of children-");
        int children = input.nextInt();

       //Divide to get equal no chocolate to every children
        int chocolatesPerChild = chocolates / children;

       //mode to get reminder 
        int remainingChocolates = chocolates % children;

        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild +
                " and the number of remaining chocolates are " + remainingChocolates);
    }
}
