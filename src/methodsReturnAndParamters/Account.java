package methodsReturnAndParamters;

public class Account {

	String nameOFAccountHolder;
	String accountType;
	String accountNumber;

	double balance;
	int pin;

	public String getNameOfAccountHolder() {
		return nameOFAccountHolder;
	}

	public double getBalance() {
		return balance;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public String getAccountType() {
		return accountType;
	}

	public boolean validatePin(int pinEntered) {

		if (pin == pinEntered) {
			return true;
		}
		return false;

	}

	public boolean validateCredentials(String accountNumberEntered, int pinEntered) {
		if (accountNumber.equals(accountNumberEntered)) {
			if (validatePin(pinEntered)) {
				return true;
			}
		}
		return false;
	}

	public Account getAccountIfValidCredentials(String accountNumberEntered, int pinEntered, Account[] accounts) {
		Account ac = new Account();
		for (int i = 0; i < accounts.length; i++) {
			if (accounts[i].getAccountNumber().equals(accountNumberEntered)) {
				if (accounts[i].pin==pinEntered) {
					return accounts[i];
				}
			}
		}
		return null;
	}
	
	public void displayAccountDetails() {
		System.out.println("Account Holder Name: " + getNameOfAccountHolder());
		System.out.println("Type Of Account: " +getAccountType());
		System.out.println("Account Balance: " +getBalance());
	}

}