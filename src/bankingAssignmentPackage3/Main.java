package bankingAssignmentPackage3;

import java.util.Scanner;

import bankingAssignmentPackage1.Person;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ATM atm;
		OnlineBanking onlineBanking;

		System.out.println("Please enter the Banking service you want: \n 1. ATM \n 2. Online");
		int bankingType = sc.nextInt();
		switch (bankingType) {
		case 1:
			atm = new ATM();
			atm.details = new Person(10000, 1234);
			if (atm.validatePin()) {
				atm.selectOption();
			}
			break;

		case 2:
			onlineBanking = new OnlineBanking();
			onlineBanking.details = new Person(10000, "123456", "Gur123");

			if (onlineBanking.validateAccountNumber() && onlineBanking.validatePassword()) {
				onlineBanking.selectOption();
			}
			break;

		default:
			System.out.println("Invalid Input");
			break;
		}
		sc.close();
	}
}
