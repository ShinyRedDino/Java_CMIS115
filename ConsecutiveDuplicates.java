import java.util.Scanner;

public class ConsecutiveDuplicates {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int previousNumber = -1;  // Initialize to a value that won't be in the input
        int consecutiveDuplicateCount = 0;

        while (true) {
            System.out.print("Enter a non-negative integer (negative to terminate): ");
            int number = stdin.nextInt();

            if (number < 0) {
                break;  // Terminate the loop when a negative number is entered
            }

            if (number == previousNumber) {
                consecutiveDuplicateCount++;
            }

            previousNumber = number;
        }

        System.out.println("Number of consecutive duplicates: " + consecutiveDuplicateCount);

        // Close the scanner
        stdin.close();
    }
}