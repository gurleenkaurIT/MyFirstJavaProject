package bankingAssignmentPackage3;

import java.util.Scanner;

import bankingAssignmentPackage1.Person;

public class ATM extends BankingRules implements BankOperations {

	Person details;
	Scanner sc = new Scanner(System.in);

	private static int noOfTransactionsAllowed;
	private int noOfTransactionsAvailable = 1;
	private boolean isPinCorrect = false;
	private static double dailyWithdrawalLimit;
	private double remainingWithdrawalLimit;
	private int numberOfWithdraw = 1;

	public void selectOption() {
		System.out.println("Would you like to :\n 1. continue \n 2. exit");
		int option = sc.nextInt();
		switch (option) {
		case 1:
			System.out.println("Would you like to: \n 1. Perform transaction \n 2. View Balance");
			int balanceOrTransaction = sc.nextInt();
			switch (balanceOrTransaction) {
			case 1:
				if (noOfTransactionsAllowed()) {
					System.out.println("1. Deposit \n2. Withdraw");
					int depositOrWithdraw = sc.nextInt();
					switch (depositOrWithdraw) {
					case 1:
						depositAmount();
						break;

					case 2:
						withdrawAmount();
						break;

					default:
						System.out.println("Invalid Input");
						break;
					}
				} else {
					System.out.println("You have recahed maximum number of transactions");
				}
				break;

			case 2:
				viewBalance();
				selectOption();
				break;

			default:
				System.out.println("Invalid Input");
				break;
			}
			break;

		case 2:
			System.out.println("Exiting........");
			System.exit(0);
			break;

		default:
			System.out.println("Invalid Input");
			break;
		}
	}

	@Override
	public void withdrawAmount() {
		System.out.println("Enter withdraw amount: ");
		double amountWithdrawn = sc.nextDouble();
		if (amountWithdrawn > 0) {
			if (details.getFundsAvailable() > 0 && details.getFundsAvailable() >= amountWithdrawn) {
				if (dailyWithdarwalLimit() >= amountWithdrawn) {
					remainingWithdrawalLimit = dailyWithdrawalLimit - amountWithdrawn;
					double fundsInitially = details.getFundsAvailable();
					double fundsAfterWithdraw = fundsInitially - amountWithdrawn;
					details.setFundsAvailable(fundsAfterWithdraw);
					System.out.println("Amount Withdrawn");
					viewBalance();
				} else {
					System.out.println("You have reached maximum withdrawal Limit");
				}
			} else {
				System.out.println("Sorry! Insufficent Funds");
			}
		} else {
			System.out.println("Amount withdrawn can't be zero");
		}
		selectOption();
	}

	@Override
	public void depositAmount() {
		System.out.println("Enter deposit amount: ");
		double amountDeposited = sc.nextDouble();
		if (amountDeposited > 0) {
			double fundsInitially = details.getFundsAvailable();
			double fundsAfterDeposit = amountDeposited + fundsInitially;
			details.setFundsAvailable(fundsAfterDeposit);
			System.out.println("Amount Deposited");
			viewBalance();
			selectOption();
		} else {
			System.out.println("Amount deposited can't be zero");
		}
		selectOption();
	}

	public boolean validatePin() {
		int attempt = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter PIN");
			int pinEntered = sc.nextInt();
			attempt++;
			if (pinEntered == details.getPin()) {
				isPinCorrect = true;
				break;
			} else if (attempt < 3) {

				System.out.println("Pin is Incorrect. Try again!!");
			} else {
				System.out.println("Account Locked");
			}
		}
		if (!isPinCorrect) {
			System.exit(0);
		}
		return isPinCorrect;

	}

	@Override
	public void viewBalance() {
		System.out.println("Balance is : " + details.getFundsAvailable());

	}

	@Override
	public double dailyWithdarwalLimit() {
		if (numberOfWithdraw == 1) {
			dailyWithdrawalLimit = 2000;
			numberOfWithdraw++;
		} else if (numberOfWithdraw > 1) {
			dailyWithdrawalLimit = remainingWithdrawalLimit;
		}
		return dailyWithdrawalLimit;
	}

	@Override
	public boolean noOfTransactionsAllowed() {
		noOfTransactionsAllowed = 5;
		if (noOfTransactionsAvailable <= noOfTransactionsAllowed) {
			noOfTransactionsAvailable++;
			return true;
		}
		return false;

	}

	@Override
	public void changePinPassword() {
		System.out.println("Enter New Pin");
		int newPin = sc.nextInt();
		if (details.getPin() != newPin) {
			int length = String.valueOf(newPin).length();
			if (length >= 4) {
				details.setPin(newPin);
				System.out.println("PIN updated");
			} else {
				System.out.println("PIN must contain 4 or more digits");
			}
		} else {
			System.out.println("New PIN cannot be same as old PIN");
		}
	}

}
