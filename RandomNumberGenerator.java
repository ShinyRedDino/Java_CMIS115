import java.util.Scanner;

//Random number generator can be useful for a multiple of things. For this example we will use it as a game dice for a board game.
public class RandomNumberGenerator {

    public static void main(String[] args) {
        //Declare new scanner method to get input from user
        Scanner input = new Scanner(System.in);

        //Ask user how many side their dice are & declare new variable for max sides of dice
        System.out.print("How many side is your dice? ");
        int maxSide = input.nextInt();

        //If user does not enter a number greater than or equal to 1 the program terminates
        if (maxSide >= 1) {
            //Get the rolled number, add 1 to max side. Without adding 1 the max number will be -1 of what user picked.
            int rolledNumber = (int)(Math.random()*maxSide + 1);

            //Output the rolled number for the user
            System.out.print("You rolled a " + rolledNumber +"!");
        } else {
            System.out.print("Please enter a positive number that is greater than or equal to 1.");
            System.exit(0);
        }

        input.close();
    }

}