package bankingAssignmentPackage1;

public class ATM extends BankOperations {

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

}
