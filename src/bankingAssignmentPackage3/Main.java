package bankingAssignmentPackage3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ATM atm = new ATM();
		atm.details = new Person();

		OnlineBanking onlineBanking = new OnlineBanking();
		onlineBanking.details = new Person();

		System.out.println("Please enter the Banking service you want:" + '\n' + "1. ATM" + '\n' + "2. Online");
		int bankingType = sc.nextInt();

		if (bankingType == 1) {
			if (atm.validatePin()) {
				atm.selectOption();
			}

		} else if (bankingType == 2) {
			if (onlineBanking.validateAccountNumber()) {
				if (onlineBanking.validatePassword()) {
					onlineBanking.selectOption();
				}
			}
		} else {
			System.out.println("Invalid Input");
		}

		sc.close();

	}
}
