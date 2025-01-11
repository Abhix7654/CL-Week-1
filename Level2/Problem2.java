import java.util.Scanner;
public class Problem2{
	public static void main(String[] args){
	 Scanner input = new Scanner(System.in);

        // Input the year
        int year = input.nextInt();

        if ((year >=1582)&& (year % 4 == 0 && year % 100 != 0) || (year >=1582) && (year % 400 == 0)) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is NOT a Leap Year.");
            }
        
	}
}