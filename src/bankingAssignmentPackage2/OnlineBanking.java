package bankingAssignmentPackage2;

import java.util.Scanner;

public class OnlineBanking extends BankOperations {

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
	public void withdrawAmount(double amountWithdraw) {
		if (amountWithdraw > 0) {
			if (details.getFundsAvailable() > 0 && amountWithdraw <= details.getFundsAvailable()) {
				double fundsInitially = details.getFundsAvailable();
				double fundsAfterWithdraw = fundsInitially - amountWithdraw;
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
		System.out.println("Enter new Password");
		String newPassword = sc.next();
		if (!newPassword.equals(details.getPassword())) {
			if (!newPassword.contains("&") && !newPassword.contains("$") && !newPassword.contains("@")
					&& newPassword.length() >= 8 && (!newPassword.isEmpty())) {
				details.setPassword(newPassword);
				System.out.println("Password Updated");

			} else {
				System.out.println(
						"Password should contain 8 or more characters and must not contain &, $ and @ characters.");
			}
		} else {
			System.out.println("New password cannot be same as old password");
		}

	}

}
