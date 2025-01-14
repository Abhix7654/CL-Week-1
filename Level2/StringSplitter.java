import java.util.Scanner;

class StringSplitter {

    // Method to find the length of the String without using length()
    public static int findLengthWithoutLengthMethod(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            // When exception occurs, we have reached the length of the string
        }
        return count;
    }

    // Method to split the text into words without using split()
    public static String[] splitTextIntoWords(String text) {
        int length = findLengthWithoutLengthMethod(text);
        int wordCount = 1; // Start with 1 word as spaces separate words

        // Count words by counting spaces
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        // Array to store the words
        String[] words = new String[wordCount];
       String str="";
        int index = 0;

        // Extract words using charAt
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
               str += text.charAt(i);  
          }else{
            words[index++]=str;
            str="";
}  }
words[index]=str;

        return words;
    }

    // Method to compare two String arrays
    public static boolean compareStringArrays(String[] array1, String[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (!array1[i].equals(array2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a sentence: ");
        String userInput = scanner.nextLine();

        // Call the user-defined method to split the text into words
        String[] customSplitWords = splitTextIntoWords(userInput);

        // Call the built-in split() method
        String[] builtInSplitWords = userInput.split(" ");

        // Compare the two arrays
        boolean areEqual = compareStringArrays(customSplitWords, builtInSplitWords);

        // Display the results
        System.out.println("Words using custom method: ");
        for (String word : customSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nWords using built-in split() method: ");
        for (String word : builtInSplitWords) {
            System.out.println(word);
        }

        System.out.println("\nAre the two methods equal? " + areEqual);

        scanner.close();
    }
}
