import java.util.Scanner;

public class Problem8{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get input age and height

        System.out.println("Enter age and height of amar  ");
        int ageAmar = input.nextInt();
        int heightAmar = input.nextInt();

        System.out.println("Enter age and height of akbar ");
        int ageAkbar = input.nextInt();
        int heightAkbar = input.nextInt();

        System.out.println("Enter age and height of anthony ");
        int ageAnthony = input.nextInt();
        int heightAnthony = input.nextInt();

        // Find youngest
       int youngestAge = Math.min(ageAmar, Math.min(ageAkbar, ageAnthony));
String youngestName;
if (youngestAge == ageAmar) {
    youngestName = "Amar";
} else if (youngestAge == ageAkbar) {
    youngestName = "Akbar";
} else {
    youngestName = "Anthony";
}

        // Find tallest
       int tallestHeight = Math.max(heightAmar, Math.max(heightAkbar, heightAnthony));
String tallestName;
if (tallestHeight == heightAmar) {
    tallestName = "Amar";
} else if (tallestHeight == heightAkbar) {
    tallestName = "Akbar";
} else {
    tallestName = "Anthony";
}


        System.out.println("The youngest is: " + youngestName);
        System.out.println("The tallest is: " + tallestName);

    }
}

