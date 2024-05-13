package bankingAssignmentPackage2;

import bankingAssignmentPackage1.Person;

public abstract class BankOperations {

	Person details;

	public abstract void changePinPassword();

	public void withdrawAmount(double amountWithdrawn) {
	}

	public void depositAmount(double amountDeposited) {
	}

	public final void viewBalance() {
		System.out.println("Balance is : " + details.getFundsAvailable());
	}

}
