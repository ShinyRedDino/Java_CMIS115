import java.util.Scanner;

public class QuestionOne {
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);
        int evenSum = 0;
        int oddSum = 0;
        int evenCount = 0;
        int oddCount = 0;

        while (true) {
            System.out.print("Enter a positive integer: ");
            int number = stdin.nextInt();

            if (number <= 0) {
                break;  // Terminate the loop if a non-positive integer is entered
            }

            if (number % 2 == 0) {
                evenSum += number;
                evenCount++;
            } else {
                oddSum += number;
                oddCount++;
            }
        }

        System.out.println("Sum of even integers: " + evenSum);
        System.out.println("Sum of odd integers: " + oddSum);
        System.out.println("Count of even integers: " + evenCount);
        System.out.println("Count of odd integers: " + oddCount);

        // Close the scanner
        stdin.close();
    }
}