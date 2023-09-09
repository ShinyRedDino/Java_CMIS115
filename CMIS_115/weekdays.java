// Jeremy Handy - CMIS 115 - 1 September 2023

import java.util.Scanner;

public class weekdays {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your gpa (allowed values are 4.0, 3.5, etc.): ");
        double gpa = input.nextDouble();
        
        // Nested if statements
        // Each statement checks specific condition. If it is not met it moves to next if statement
        if (gpa == 4.0) {
            System.out.println("Outstanding performance! ");
        } else {
            if (gpa >= 3.5) {
                System.out.println("You're still doing great! Keep up the great work ");
            } else {
                if (gpa >= 3.0) {
                    System.out.println("Time to start thinking about studying more. ");
                } else {
                    if (gpa < 3.0) {
                        System.out.println("It might be time to talk to a tutor. ");
                    }
                }
            }
        }
        
        // Multi-way if statements
        // Uses if, else if, and else, conditions are evaluated one by one from top to bottom
        if (gpa >= 4.0) {
            System.out.println("Your grades reflects your dedication and hard work ");
        } else if (gpa >= 3.5) {
            System.out.println("Don't forget to keep studying. ");        
        } else if (gpa >= 3.0) {
            System.out.println("The clock is ticking towards enhancing your academic performance. ");
        } else {
            System.out.println("Commit to a phase of intense learning and growth. ");
        }
        
        // Switch statements
        // Each case represents a specific value, if none are met it uses default code
        // All case statements should be ended with break;
        int gpaAsInt = (int) (gpa * 10); // Convert GPA to int
        System.out.println("Your GPA is " + gpa);
        switch (gpaAsInt) {
            case 40: // 4.0 GPA
                System.out.println("WOW! A 4.0, Great job!");
                break;
            case 39:
            case 38:
            case 37:
            case 36:
            case 35: // 3.5 GPA
                System.out.println("You're close to the 4.0. Keep up the hard work, you'll get there!");
                break;
            case 34:
            case 33:
            case 32:
            case 31:            	
            case 30: // 3.0 GPA
                System.out.println("Keep up the hard work. There are plenty of school resources to help you if you need it.");
                System.out.println("Don't be afraid to ask for help.");
                break;
            default:
            	System.out.println("It might be time to talk to a tutor. ");
        }
        input.close();
        System.exit(0);
    }
}
