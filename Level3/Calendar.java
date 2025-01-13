import java.util.Scanner;

class Calendar{

    // Array of month names
    private static final String[] MONTH_NAMES = {
        "January", "February", "March", "April", "May", "June", 
        "July", "August", "September", "October", "November", "December"
    };

    // Array of days in each month (non-leap year)
    private static final int[] DAYS_IN_MONTH = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user to enter month and year
        System.out.print("Enter month (MM): ");
        int month = scanner.nextInt();
        System.out.print("Enter year (YYYY): ");
        int year = scanner.nextInt();

        // Print the month and year
        System.out.println("\n" + getMonthName(month) + " " + year);
        // Print the days of the week
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Calculate the first day of the month and the number of days in the month
        int firstDay = getFirstDay(month, year);
        int daysInCurrentMonth = getDaysInMonth(month, year);

        // Print spaces for the first day of the month
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int i = 1; i <= daysInCurrentMonth; i++) {
            System.out.printf("%3d ", i);
            // Start a new line after Saturday
            if ((i + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
    }

    // Method to get the name of the month
    private static String getMonthName(int month) {
        return MONTH_NAMES[month - 1];
    }

    // Method to get the number of days in the month
    private static int getDaysInMonth(int month, int year) {
        // Check if the month is February and the year is a leap year
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return DAYS_IN_MONTH[month - 1];
    }

    // Method to check if a year is a leap year
    private static boolean isLeapYear(int year) {
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }

    // Method to calculate the first day of the month
    private static int getFirstDay(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + 31 * m0 / 12) % 7;
    }
}
