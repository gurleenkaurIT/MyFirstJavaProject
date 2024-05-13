package bankingAssignmentPackage2;

import java.util.Scanner;

public class ATM extends BankOperations {
	Scanner sc = new Scanner(System.in);

	@Override
	public void depositAmount(double amountDeposited) {
		if (amountDeposited > 0) {
			double fundsInitially = details.getFundsAvailable();
			double fundsAfterDeposit = amountDeposited + fundsInitially;
			details.setFundsAvailable(fundsAfterDeposit);
			System.out.println("Amount deposited");
			viewBalance();
		} else {
			System.out.println("Amount deposited can't be zero");
		}

	}

	@Override
	public void withdrawAmount(double amountWithdrawn) {
		if (amountWithdrawn > 0) {
			if (details.getFundsAvailable() > 0 && amountWithdrawn <= details.getFundsAvailable()) {
				double fundsInitially = details.getFundsAvailable();
				double fundsAfterWithdraw = fundsInitially - amountWithdrawn;
				details.setFundsAvailable(fundsAfterWithdraw);
				System.out.println("Amount Withdrawn");
				viewBalance();
			} else {
				System.out.println("Sorry! Insufficent Funds");
			}
		} else {
			System.out.println("Amount withdrawn can't be zero");
		}
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
