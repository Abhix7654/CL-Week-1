import  java.util.Scanner;
class WindChillCalculator {

   // Method to calculate wind chill temperature
   public double calculateWindChill(double temperature, double windSpeed) {
     
      //Formula windChill = 35.74 + 0.6215 *temp + (0.4275*temp - 35.75) * windSpeed^0.16
      return 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
   }

   public static void main(String[] args) {
      //Create class obj 
      WindChillCalculator calculator = new WindChillCalculator();

      // User input for temperature and wind speed
      Scanner input = new Scanner(System.in);
      System.out.print("Enter temperature ");
      double temperature = input.nextDouble();
      System.out.print("Enter wind speed ");
      double windSpeed = input.nextDouble();

      // Calculate and display wind chill
      double windChill = calculator.calculateWindChill(temperature, windSpeed);
      System.out.println("The wind chill temperature is: " + windChill);
   }
}