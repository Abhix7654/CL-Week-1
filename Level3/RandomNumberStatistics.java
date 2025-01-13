import java.util.Arrays;

class FootballTeamStats {

    /**
     * Generates an array of random heights for a football team.
     * 
     * return An array of 11 random heights in the range 150–250 cm.
     */
    public static int[] generatePlayerHeights() {
        int[] heights = new int[11];
        for (int i = 0; i < heights.length; i++) {
            heights[i] = (int) (Math.random() * 101) + 150; // Random height between 150–250 cm
        }
        return heights;
    }

    /**
     * Calculates the sum of heights in the array.
     * 
     * heights Array of player heights.
     * return The total sum of heights.
     */
    public static int computeSumOfHeights(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    /**
     * Calculates the mean height of players.
     * 
     * heights Array of player heights.
     * return The mean height.
     */
    public static double computeMeanHeight(int[] heights) {
        return (double) computeSumOfHeights(heights) / heights.length;
    }

    /**
     * Finds the shortest height among the players.
     * 
     * heights Array of player heights.
     * return The shortest height.
     */
    public static int findShortestHeight(int[] heights) {
        int min = Integer.MAX_VALUE;
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    /**
     * Finds the tallest height among the players.
     * 
     *  heights Array of player heights.
     * return The tallest height.
     */
    public static int findTallestHeight(int[] heights) {
        int max = Integer.MIN_VALUE;
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Step 1: Generate random heights for the football team
        int[] playerHeights = generatePlayerHeights();
        System.out.println("Player Heights (in cm): " + Arrays.toString(playerHeights));

        // Step 2: Compute sum, mean, shortest, and tallest heights
        int sumOfHeights = computeSumOfHeights(playerHeights);
        double meanHeight = computeMeanHeight(playerHeights);
        int shortestHeight = findShortestHeight(playerHeights);
        int tallestHeight = findTallestHeight(playerHeights);

        // Step 3: Display the results
        System.out.println("\nResults:");
        System.out.println("Total Sum of Heights: " + sumOfHeights + " cm");
        System.out.println("Mean Height: " + meanHeight + " cm");
        System.out.println("Shortest Height: " + shortestHeight + " cm");
        System.out.println("Tallest Height: " + tallestHeight + " cm");
    }
}
