import java.util.*;

class GenerateOtp{

    // Method to generate a 6-digit OTP
    public static int generateOtp() {
        int otp = (int) (Math.random() * 900000) + 100000;
        System.out.println("Generated OTP: " + otp);
        return otp;
    }

    // Method to check if all OTP numbers are unique in the array
    public static boolean areOtpNumbersUnique(int[] otpNumbers) {
        // Iterate through the array and check for duplicates
        for (int i = 0; i < otpNumbers.length; i++) {
            for (int j = i + 1; j < otpNumbers.length; j++) {
                if (otpNumbers[i] == otpNumbers[j]) {
                    return false; // Duplicate found
                }
            }
        }
        return true; // No duplicates found
    }

    public static void main(String[] args) {

        int[] otpNumbers = new int[10];

        // Generate OTP numbers and store them in the array
        for (int i = 0; i < 10; i++) {
            otpNumbers[i] = generateOtp();
        }

        // Check if all OTP numbers are unique
        if (areOtpNumbersUnique(otpNumbers)) {
            System.out.println("All OTP numbers are unique.");
        } else {
            System.out.println("Not all OTP numbers are unique.");
        }
    }
}
