import java.util.Scanner;

class SplitTextIntoWords {

    // Method to split the text into words using charAt()
    public static String[] splitText(String text) {
        text = text.trim(); // Remove leading and trailing spaces
             int length = getStringLength(text);
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
        System.out.println("Word\tLength");
        for (String[] pair : wordsAndLengths) {
            System.out.println(pair[0] + "  \t   "+ Integer.parseInt(pair[1]));
        }
    }
}
