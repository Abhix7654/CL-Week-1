class NullPointerExceptionDemo {

    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null;
        System.out.println(text.length()); // Will throw NullPointerException
    }

    // Method to handle NullPointerException
    public static void handleNullPointerException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("Generating NullPointerException...");
        try {
            generateNullPointerException();
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.println("Handling NullPointerException...");
        handleNullPointerException();
    }
}
