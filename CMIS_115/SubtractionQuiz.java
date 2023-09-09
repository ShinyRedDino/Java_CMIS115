import java.util.Scanner;

public class SubtractionQuiz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//generate 2 random numbers
		int number1 = (int) (Math.random() * 100);
		int number2 = (int) (Math.random() * 100);

		//
		if (number2 > number1) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}
		
		// prompt the student to answer what is number 1 - number 2
		System.out.print("What is " + number1 + " - " + number2 + "? ");
		Scanner input = new Scanner(System.in); 
		int answer = input.nextInt();
		
		if (number1 - number2 == answer) {
			System.out.println("You are correct! Great Job");
		} else {
			System.out.println("You are incorrect!\nThe correct answer was: " + (number1 - number2));
		}
		input.close();
	}
}
