package core_programming.java_methods.level3_problems;

public class OTPGenerator {
    // Method to generate a single 6-digit OTP
    public static int generateOTP() {
        // Generate random number between 100000 and 999999
        return 100000 + (int)(Math.random() * 900000);
    }

    // Method to check if all OTPs in array are unique
    public static boolean areOTPsUnique(int[] otps) {
        for (int i = 0; i < otps.length; i++) {
            for (int j = i + 1; j < otps.length; j++) {
                if (otps[i] == otps[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // Method to generate an array of 10 OTPs and ensure uniqueness
    public static int[] generateMultipleOTPs() {
        int[] otps = new int[10];
        boolean uniqueOTPs = false;

        while (!uniqueOTPs) {
            // Generate 10 OTPs
            for (int i = 0; i < 10; i++) {
                otps[i] = generateOTP();
            }

            // Check if all generated OTPs are unique
            uniqueOTPs = areOTPsUnique(otps);
        }

        return otps;
    }

    public static void main(String[] args) {
        System.out.println("Generating 10 unique 6-digit OTP numbers:");

        int[] otps = generateMultipleOTPs();

        // Print all generated OTPs
        for (int i = 0; i < otps.length; i++) {
            System.out.printf("OTP %2d: %06d%n", (i + 1), otps[i]);
        }
        System.out.println();

//         Verify uniqueness
        System.out.println("Verifying uniqueness of generated OTPs...");
        System.out.println(areOTPsUnique(otps));
    }
}
