package bankingAssignmentPackage3;

import java.util.Scanner;

public class OnlineBanking extends BankingRules implements BankOperations {
	Person details;

	Scanner sc = new Scanner(System.in);

	private int noOfTransactionsAllowed;
	private int noOfTransactionsAvailable = 0;
	private boolean isPasswordCorrect = false;
	private double amountWithdrawn;
	private double dailyWithdrawalLimit;
	double remainingWithdrawalLimit;

	public void selectOption() {
		System.out.println("Would you like to : " + '\n' + "1. continue" + '\n' + "2. exit");
		int option = sc.nextInt();
		if (option == 1) {
			System.out.println("Would you like to: " + '\n' + "1. View Balance" + '\n' + "2. Perform transaction");
			int balOrTransaction = sc.nextInt();
			if (balOrTransaction == 1) {
				viewBalance();
				selectOption();
			} else if (balOrTransaction == 2) {
				if (noOfTransactionsAllowed()) {
					System.out.println(
							"Would you like to: " + '\n' + "1. Deposit amount" + '\n' + "2. Withdraw amount: ");
					int depositOrWithdraw = sc.nextInt();
					if (depositOrWithdraw == 1) {
						depositAmount();

					} else if (depositOrWithdraw == 2) {
						withdrawAmount();
					} else {
						System.out.println("Please enter valid option");
					}
				} else {
					System.out.println("You have recahed maximum number of transactions");
				}
			} else {
				System.out.println("Please enter valid option");
			}
		} else if (option == 2) {
			System.out.println("Exiting........");
			System.exit(0);

		} else {
			System.out.println("Invalid Input");
		}

	}

	@Override
	public void withdrawAmount() {
		
			System.out.println("Enter withdraw amount: ");
			double amountWithdraw = sc.nextDouble();
			if (details.getFundsAvailable() > 0) {
				if ((details.getFundsAvailable() >= amountWithdraw)) {
					if (dailyWithdarwalLimit() > amountWithdraw) {
						remainingWithdrawalLimit = dailyWithdrawalLimit - amountWithdrawn;
						double fundsInitially = details.getFundsAvailable();
						double fundsAfterInterac = fundsInitially - amountWithdraw;
						details.setFundsAvailable(fundsAfterInterac);
						System.out.println("Amount Withdrawn");
						noOfTransactionsAvailable++;
						viewBalance();

					} else {
						System.out.println("You have reached maximum Limit");
					}

				} else {
					System.out.println("Withdrawn amount should be less than the Funds available");
				}
			} else {
				System.out.println("Sorry! Insufficent Funds");
			}
			selectOption();
	}

	@Override
	public void depositAmount() {

		System.out.println("Enter deposit amount: ");
		double amountDeposited = sc.nextDouble();

		double fundsInitially = details.getFundsAvailable();
		double fundsAfterDeposit = amountDeposited + fundsInitially;
		details.setFundsAvailable(fundsAfterDeposit);
		System.out.println("Amount Deposited");
		viewBalance();
		selectOption();

	}

	public boolean validatePassword() {
		int attempt = 0;
		for (int i = 0; i < 3; i++) {
			System.out.println("Enter Password");
			String passwordEntered = sc.next();
			if (details.getPassword().equals(passwordEntered)) {
				isPasswordCorrect = true;
				break;
			} else if (attempt < 3) {
				System.out.println("Password is Incorrect. Try again");
			} else {
				System.out.println("Account Locked");
			}
		}
		if (!isPasswordCorrect) {
			System.exit(0);
		}
		return isPasswordCorrect;

	}

	public boolean validateAccountNumber() {
		System.out.println("Enter account Number");
		String accountNumberEntered = sc.next();
		if (details.getAccountNumber().equals(accountNumberEntered)) {
			return true;
		}
		return false;
	}

	@Override
	public void viewBalance() {
		System.out.println("Balance is : " + details.getFundsAvailable());

	}

	@Override
	public double dailyWithdarwalLimit() {
		if (remainingWithdrawalLimit != 0) {
			dailyWithdrawalLimit = remainingWithdrawalLimit;
			return dailyWithdrawalLimit;
		} else {
			dailyWithdrawalLimit = 2000;
			return dailyWithdrawalLimit;
		}
	}

	@Override
	public boolean noOfTransactionsAllowed() {
		noOfTransactionsAllowed = 3;
		if (noOfTransactionsAvailable <= noOfTransactionsAllowed) {
			noOfTransactionsAvailable++;
			return true;
		}
		return false;

	}

}
