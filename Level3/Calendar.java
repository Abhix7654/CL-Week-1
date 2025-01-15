import java.util.Scanner;

class Calendar {

    // Array storing names of the months
    private static final String[] MONTH_NAMES = {
        "January", "February", "March", "April", "May", "June",
        "July", "August", "September", "October", "November", "December"
    };

    // Array storing the number of days in each month (non-leap year)
    private static final int[] DAYS_IN_MONTH = {
        31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user for input with validation
        int month = 0, year = 0;
        while (true) {
            System.out.print("Enter month (1-12): ");
            month = scanner.nextInt();
            if (month >= 1 && month <= 12) break;
            System.out.println("Invalid month. Please try again.");
        }

        while (true) {
            System.out.print("Enter year (e.g., 1900–2100): ");
            year = scanner.nextInt();
            if (year >= 1900 && year <= 2100) break;
            System.out.println("Invalid year. Please try again.");
        }

        // Display the calendar header
        System.out.println("\n" + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Get the first day of the month and the number of days in the month
        int firstDay = getFirstDay(month, year);
        int daysInCurrentMonth = getDaysInMonth(month, year);

        // Print leading spaces for the first day
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    ");
        }

        // Print the days of the month
        for (int i = 1; i <= daysInCurrentMonth; i++) {
            System.out.printf("%3d ", i);
            if ((i + firstDay) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println(); // Move to a new line after the last day

        scanner.close(); // Close the scanner
    }

    // Method to get the name of the month based on its number
    public static String getMonthName(int month) {
        return MONTH_NAMES[month - 1];
    }

    // Method to get the number of days in the given month and year
    public static int getDaysInMonth(int month, int year) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return DAYS_IN_MONTH[month - 1];
    }

    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    // Method to calculate the first day of the month using Zeller's congruence
 public static int getFirstDay(int month, int year) {
    if (month < 3) {
        month += 12;
        year--;
    }
    int k = year % 100; // Year within the century
    int j = year / 100; // Century part of the year
    int dayOfWeek = (1 + (13 * (month + 1)) / 5 + k + k / 4 + j / 4 - 2 * j) % 7;

    // Convert Zeller's result to match Sunday=0, Monday=1, ..., Saturday=6
    return (dayOfWeek + 6) % 7;
}

}
