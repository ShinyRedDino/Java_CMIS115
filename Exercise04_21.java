import java.util.Scanner;

public class Exercise04_21 {
    public static void main(String[] args) {
        Scanner SSN_input = new Scanner(System.in);

        System.out.print("Enter a SSN: ");
        String SSN_Number = SSN_input.nextLine();

        if (SSN_Number.charAt(3) == '-' && SSN_Number.charAt(6) == '-') {
            System.out.print(SSN_Number + " is a valid social security number");
        } else {
            System.out.print(SSN_Number + " is an invalid social security number");
            System.exit(0);
        }
    }
}