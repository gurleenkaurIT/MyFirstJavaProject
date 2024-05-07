package bankingAssignmentPackage1;

public class OnlineBanking extends BankOperations {

	@Override
	public void withdrawAmount(double amountWithdraw) {

		if (details.getFundsAvailable() > 0) {
			if (amountWithdraw <= details.getFundsAvailable()) {

				double fundsInitially = details.getFundsAvailable();
				double fundsAfterWithdraw = fundsInitially - amountWithdraw;
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

	@Override
	public void depositAmount(double amountDeposited) {

		double fundsInitially = details.getFundsAvailable();
		double fundsAfterDeposit = amountDeposited + fundsInitially;
		details.setFundsAvailable(fundsAfterDeposit);
		System.out.println("Amount deposited");
		viewBalance();

	}

}
