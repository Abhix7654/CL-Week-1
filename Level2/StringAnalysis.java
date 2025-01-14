import java.util.Scanner;

class StringAnalysis {

    // Method to find the length of a string without using length()
    public static int findLengthWithoutLengthMethod(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // Exception occurs when the end of the string is reached
        }
        return count;
    }

    // Method to split the text into words using charAt()
    public static String[] splitTextIntoWords(String text) {
        int length = findLengthWithoutLengthMethod(text);
        int wordCount = 1; // At least one word is present

        // Count words based on spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Array to store words
        String[] words = new String[wordCount];
         String str="";
        int index = 0;

        // Extract words using charAt
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
               str+=text.charAt(i);  
          }else{
            words[index++]=str;
            str="";
   }  }
         words[index]=str;

        return words;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] createWordLengthArray(String[] words) {
        String[][] wordLengthArray = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            wordLengthArray[i][0] = words[i]; // Word
            wordLengthArray[i][1] = String.valueOf(findLengthWithoutLengthMethod(words[i])); // Length as String
        }
        return wordLengthArray;
    }

    // Method to find the shortest and longest word
    public static String[] findShortestAndLongestWords(String[][] wordLengthArray) {
        String shortestWord = wordLengthArray[0][0];
        String longestWord = wordLengthArray[0][0];
        int shortestLength = Integer.parseInt(wordLengthArray[0][1]);
        int longestLength = Integer.parseInt(wordLengthArray[0][1]);

        for (String[] wordInfo : wordLengthArray) {
            int currentLength = Integer.parseInt(wordInfo[1]);
            if (currentLength < shortestLength) {
                shortestLength = currentLength;
                shortestWord = wordInfo[0];
            }
            if (currentLength > longestLength) {
                longestLength = currentLength;
                longestWord = wordInfo[0];
            }
        }
        return new String[]{shortestWord, longestWord};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        // Split the text into words
        String[] words = splitTextIntoWords(userInput);

        // Create 2D array of words and their lengths
        String[][] wordLengthArray = createWordLengthArray(words);

        // Find the shortest and longest words
        String[] shortestAndLongest = findShortestAndLongestWords(wordLengthArray);

        // Display the results
        System.out.println("\nWords and their lengths:");
        for (String[] wordInfo : wordLengthArray) {
            System.out.println("Word: " + wordInfo[0] + ", Length: " + wordInfo[1]);
        }

        System.out.println("\nShortest word: " + shortestAndLongest[0]);
        System.out.println("Longest word: " + shortestAndLongest[1]);

        scanner.close();
    }
}