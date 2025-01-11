import java.util.Scanner;
class Problem8{
   
   public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
      // Create a variable name to indicate the person traveling

System.out.println("enter the name of a person");
  

      String name = sc.nextLine();
      
      // Create a variable fromCity, viaCity and toCity to indicate the city
      // from city, via city and to city the person is travelling
System.out.println("enter the cities");
      String fromCity = sc.nextLine(), viaCity = sc.nextLine(), toCity = sc.nextLine();

      // Create a variable distanceFromToVia to indicate the distance 
      // between the fromCity to viaCity
System.out.println("enter the distancefromvia");
      double distanceFromToVia = sc.nextDouble();

      // Create a variable timeFromToVia to indicate the time taken to 
      // travel from fromCity to viaCity in minutes
   System.out.println("the time taken to travel from fromCity to viaCity in minutes");
      int timeFromToVia = sc.nextInt();

      // Create a variable distanceViaToFinalCity to indicate the distance 
      // between the viaCity to toCity
System.out.println("enter the distanceViaToFinalCity");

      double distanceViaToFinalCity = sc.nextDouble();

      // Create a variable timeViaToFinalCity to indicate the time taken to
      // travel from viaCity to toCity in minutes
System.out.println("the time taken to travel from viaCity  to finalcity in minutes");

      int timeViaToFinalCity = sc.nextInt();

      // Create a variable totalDistance to indicate the total distance
      // between the fromCity to toCity
      double totalDistance = distanceFromToVia + distanceViaToFinalCity;

      // Create a variable totalTime to indicate the total time taken to
      // travel from fromCity to toCity in minutes
      int totalTime = timeFromToVia + timeViaToFinalCity;

// 
      // Print the travel details
      System.out.println("The Total Distance travelled by " + name + " from " + 
                         fromCity + " to " + toCity + " via " + viaCity +
                         " is " + totalDistance + " km and " +
                         "the Total Time taken is " + totalTime + " minutes");
   }
}