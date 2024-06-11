package CodingPractice;

public class TryCatchExcept {
    public int divide(int numerator, int denominator) throws ArithmeticException {
        return numerator / denominator;
    }

    public static void main(String[] args) {
        TryCatchExcept example = new TryCatchExcept();

        int numerator = 10;
        int denominator = 0;
        int result = 0;

        try {
            // Attempt to divide the numbers
            result = example.divide(numerator, denominator);
        } catch (ArithmeticException e) {
            // Handle the exception if division by zero occurs
            System.err.println("An ArithmeticException was caught: " + e.getMessage());
        } finally {
            // This block will always execute
            System.out.println("Division operation completed.");
        }

        // Print the result if no exception occurred
        if (denominator != 0) {
            System.out.println("Result: " + result);
        }
    }
}
