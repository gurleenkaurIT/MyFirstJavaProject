package switchStatement;

import java.util.Scanner;

public class SwitchStatement {

	Scanner sc = new Scanner(System.in);

	public void daysOfWeek() {

		System.out.println("Enter a number");
		int inputOfUser = sc.nextInt();

		switch (inputOfUser) {
		case 1:
			System.out.println("Sunday");

			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;

		default:
			System.out.println("Enter a valid number");
			break;
		}
	}

}
