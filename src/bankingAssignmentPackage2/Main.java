package bankingAssignmentPackage2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BankOperations bankOperations = new ATM();
		bankOperations.details = new Person();
		
		BankOperations bankOperations2 = new OnlineBanking();
		bankOperations2.details = new Person();

		System.out.println("Please enter the Banking service you want:" + '\n' + "1. ATM" + '\n' + "2. Online");
		int bankingType = sc.nextInt();

		switch (bankingType) {
		case 1:

			System.out.println("Enter PIN: ");
			int pinEntered = sc.nextInt();

			bankOperations.validatePin(pinEntered);

			System.out.println("Enter new PIN: ");
			int newPin = sc.nextInt();

			bankOperations.changePinPassword(newPin);

			break;

		case 2:
			System.out.println("Enter Account Number: ");
			String accountNumberEntered = sc.next();

			System.out.println("Enter Password: ");
			String passwordEntered = sc.next();

			bankOperations2.validateAccountNumberAndPassword(accountNumberEntered, passwordEntered);

			System.out.println("Enter New Password: ");
			String newPassword = sc.next();

			bankOperations2.changePinPassword(newPassword);

			break;
		default:
			System.out.println("Please enter Valid Banking Service ATM or Online");
			break;
		}

		sc.close();

	}

}
