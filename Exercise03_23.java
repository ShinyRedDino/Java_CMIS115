import java.util.Scanner;

public class Exercise03_23 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your x Coordinate: ");
		double xCord = input.nextDouble();
		System.out.print("Please enter your y Coordinate: ");
		double yCord = input.nextDouble();
		input.close();
		
		if ((xCord <= (5) && xCord >= -5) && (yCord <= 2.5 && yCord >= -2.5)) {
			System.out.println("Point (" + xCord + " , " + yCord  +") is in the rectangle");
		} else {
			System.out.println("Point (" + xCord + " , " + yCord  +") is not in the rectangle");
		}
		
	}

}
