package bankingAssignmentPackage1;

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

			System.out.println("You want to Deposit or Withdraw funds");
			String depositOrWithdraw = sc.next();

			switch (depositOrWithdraw) {
			case "Deposit":

				System.out.println("Enter amount to be deposited: ");
				double amountDeposit = sc.nextDouble();
				bankOperations.depositAmount(amountDeposit);

				break;

			case "Withdraw":

				System.out.println("Enter amount to be withdrawn: ");
				double amountWithdrawn = sc.nextDouble();
				bankOperations.withdrawAmount(amountWithdrawn);

				break;

			default:
				System.out.println("Please enter valid Input: Deposit or Withdraw");
				break;
			}

			break;

		case 2:
			System.out.println("Enter Account Number: ");
			String accountNumberEntered = sc.next();

			System.out.println("Enter Password: ");
			String passwordEntered = sc.next();

			bankOperations2.validateAccountNumberAndPassword(accountNumberEntered, passwordEntered);

			System.out.println("You want to Deposit or Withdraw funds");
			String depositOrInterac = sc.next();

			switch (depositOrInterac) {
			case "Deposit":

				System.out.println("Enter amount to be deposited: ");
				double amountDeposited = sc.nextDouble();

				bankOperations2.depositAmount(amountDeposited);
				bankOperations2.viewBalance();

				break;

			case "Withdraw":

				System.out.println("Enter amount to be Interaced: ");
				double amountInterac = sc.nextDouble();

				bankOperations2.withdrawAmount(amountInterac);
				bankOperations2.viewBalance();

				break;

			default:
				System.out.println("Please enter Valid Banking Service ATM or Online");
				break;
			}

			sc.close();

		}

	}
}
