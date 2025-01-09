public class Problem7 {
    public static void main(String[] args) {

        double radiusKm = 6378;
        
        double kmToMiles = 0.621371;

        double volumeKmCube = (4.0 / 3) * Math.PI * Math.pow(radiusKm, 3);

        double volumeMilesCube = volumeKmCube * Math.pow(kmToMiles, 3);

        // Output the result
        System.out.println("The volume of earth in cubic kilometers is " + volumeKmCube + 
                           " and cubic miles is " + volumeMilesCube);
    }
}
