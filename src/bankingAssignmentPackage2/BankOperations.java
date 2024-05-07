package bankingAssignmentPackage2;

public abstract class BankOperations {

	Person details;

	public abstract void changePinPassword(int newPin);

	public abstract void changePinPassword(String newPassword);

	boolean validatePin(int pinEntered) {
		if (pinEntered != details.getPin()) {
			System.out.println("PIN is Incorrect. Please start over.");
			System.exit(0);
		}
		return true;
	}

	boolean validateAccountNumberAndPassword(String accountNumberEntered, String passwordEntered) {
		if (details.getAccountNumber().equals(accountNumberEntered) && details.getPassword().equals(passwordEntered)) {
			return true;
		}
		System.out.println("Account Number or Password is Incorrect. Please start over.");
		System.exit(0);
		return false;
	}

}
