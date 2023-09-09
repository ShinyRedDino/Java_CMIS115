import java.util.Scanner;
public class Exercise03_11 {

	public static void main(String[] args) {
		//Ask user to Enter a month
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a month in the year (e.g., 1 for Jan): ");
		int monthInNumber = input.nextInt();

		//Ask user to Enter a year
		System.out.print("Enter a year: ");
		int year = input.nextInt();
			
		boolean leapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

			String monthName = null;
			int daysOfMonth = 31;
			switch (monthInNumber) {
			case 1:
				monthName = "January";
				break;
			case 2:
				monthName = "February";
				if (leapYear == true) {
					daysOfMonth = 29;
				} else {
					daysOfMonth = 28;
				}
				break;
			case 3:
				monthName = "March";
				break;
			case 4:
				monthName = "April";
				daysOfMonth = 30;
				break;
			case 5:
				monthName = "May";
				break;
			case 6:
				monthName = "June";
				daysOfMonth = 30;
				break;
			case 7:
				monthName = "July";
				break;
			case 8:
				monthName = "August";
				break;
			case 9:
				monthName = "September";
				daysOfMonth = 30;
				break;
			case 10:
				monthName = "October";
				break;
			case 11:
				monthName = "November";
				daysOfMonth = 30;
				break;
			case 12:
				monthName = "December";
				daysOfMonth = 30;
				break;
			}
			System.out.print(monthName + " " + year + " has " + daysOfMonth + " days");
			input.close();	
		}
}
		

