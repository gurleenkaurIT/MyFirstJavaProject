package bankingAssignmentPackage2;

import java.util.Scanner;

import bankingAssignmentPackage1.Person;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BankOperations bankOperations;

		System.out.println("Please enter the Banking service you want: \n 1. ATM \n 2. Online");
		int bankingType = sc.nextInt();

		switch (bankingType) {
		case 1:

			bankOperations = new ATM();
			bankOperations.details = new Person(10000, 1234);

			System.out.println("Enter PIN: ");
			int pinEntered = sc.nextInt();
			bankOperations.details.validatePin(pinEntered, bankOperations.details.getPin());

			System.out.println("You want to \n 1. Deposit \n 2. Withdraw \n 3. Change Pin");
			int operationType = sc.nextInt();

			switch (operationType) {
			case 1:

				System.out.println("Enter amount to be deposited: ");
				double amountDeposit = sc.nextDouble();
				bankOperations.depositAmount(amountDeposit);
				break;

			case 2:

				System.out.println("Enter amount to be withdrawn: ");
				double amountWithdrawn = sc.nextDouble();
				bankOperations.withdrawAmount(amountWithdrawn);
				break;

			case 3:
				bankOperations.changePinPassword();
				break;

			default:
				System.out.println("Invalid Input");
				break;
			}

			break;

		case 2:

			bankOperations = new OnlineBanking();
			bankOperations.details = new Person(10000, "12345", "Gur123");

			System.out.println("Enter Account Number: ");
			String accountNumberEntered = sc.next();

			System.out.println("Enter Password: ");
			String passwordEntered = sc.next();

			bankOperations.details.validateAccountNumberAndPassword(accountNumberEntered,
					bankOperations.details.getAccountNumber(), passwordEntered, bankOperations.details.getPassword());

			System.out.println("You want to \n 1. Deposit \n 2. Withdraw \n 3. Change Password");
			int depositOrWithdrawal = sc.nextInt();

			switch (depositOrWithdrawal) {
			case 1:

				System.out.println("Enter amount to be deposited: ");
				double amountDeposited = sc.nextDouble();
				bankOperations.depositAmount(amountDeposited);
				break;

			case 2:

				System.out.println("Enter amount to be Withdrawn: ");
				double amountWithdrawn = sc.nextDouble();
				bankOperations.withdrawAmount(amountWithdrawn);
				break;

			case 3:
				bankOperations.changePinPassword();
				break;

			default:
				System.out.println("Invalid Input");
				break;
			}

			sc.close();
		}
	}
}
