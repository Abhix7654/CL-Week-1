import java.util.Scanner;

class SplitTextIntoWords {

    // Method to split the text into words using charAt()
    public static String[] splitText(String text) {
        text = text.trim(); // Remove leading and trailing spaces
        StringBuilder word = new StringBuilder();
        int wordCount = 0;

        // Count the number of words
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word.append(text.charAt(i));
            } else if (word.length() > 0) {
                wordCount++;
                word.setLength(0); // Reset word
            }
        }
        if (word.length() > 0) wordCount++;

        // Populate the array of words
        String[] words = new String[wordCount];
        int index = 0;
        word.setLength(0); // Reset word

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ') {
                word.append(text.charAt(i));
            } else if (word.length() > 0) {
                words[index++] = word.toString();
                word.setLength(0); // Reset word
            }
        }
        if (word.length() > 0) words[index] = word.toString();

        return words;
    }

    // Method to calculate the length of a string without using length()
    public static int getStringLength(String str) {
        int length = 0;
        for (char c : str.toCharArray()) {
            length++;
        }
        return length;
    }

    // Method to create a 2D array of words and their lengths
    public static String[][] getWordsAndLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(getStringLength(words[i]));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input text
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();

        // Process text
        String[] words = splitText(text);
        String[][] wordsAndLengths = getWordsAndLengths(words);

        // Display results in tabular format
        System.out.println("Word     <->  Length");
        for (String[] pair : wordsAndLengths) {
            System.out.println(pair[0] + "     "+ Integer.parseInt(pair[1]));
        }
    }
}
