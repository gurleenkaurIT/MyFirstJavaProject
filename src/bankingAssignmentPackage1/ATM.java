package bankingAssignmentPackage1;

public class ATM extends BankOperations {

	@Override
	public void depositAmount(double amountDeposited) {
		double fundsInitially = details.getFundsAvailable();
		double fundsAfterDeposit = amountDeposited + fundsInitially;
		details.setFundsAvailable(fundsAfterDeposit);
		System.out.println("Amount deposited");
		viewBalance();

	}

	@Override
	public void withdrawAmount(double amountWithdrawn) {
		if (details.getFundsAvailable() > 0) {
			if (amountWithdrawn <= details.getFundsAvailable()) {

				double fundsInitially = details.getFundsAvailable();
				double fundsAfterWithdraw = fundsInitially - amountWithdrawn;
				details.setFundsAvailable(fundsAfterWithdraw);
				System.out.println("Amount Withdrawn");
				viewBalance();

			} else {
				System.out.println("Amount wihdrawn should be less than the Funds available");
			}

		} else {
			System.out.println("Sorry! Insufficent Funds");
		}

	}

}
