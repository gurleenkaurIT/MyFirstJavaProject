package bankingAssignmentPackage1;

public class Person {

	private String accountNumber;
	private double fundsAvailable;
	private int pin;
	private String password;

	public Person(String accountNumber, double fundsAvailable, int pin, String password) {
		super();
		this.accountNumber = accountNumber;
		this.fundsAvailable = fundsAvailable;
		this.pin = pin;
		this.password = password;
	}

	public Person(double fundsAvailable, int pin) {
		super();
		this.fundsAvailable = fundsAvailable;
		this.pin = pin;
	}

	public Person(double fundsAvailable, String accountNumber, String password) {
		super();
		this.fundsAvailable = fundsAvailable;
		this.accountNumber = accountNumber;
		this.password = password;
	}

	public String getAccountNumber() {
		return accountNumber;
	}

	public double getFundsAvailable() {
		return fundsAvailable;
	}

	public void setFundsAvailable(double fundsAvailable) {
		this.fundsAvailable = fundsAvailable;
	}

	public int getPin() {
		return pin;
	}

	public void setPin(int pin) {
		this.pin = pin;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {

		this.password = password;
	}

	public boolean validatePin(int pinEntered, int pin) {
		if (pinEntered == pin) {
			return true;
		}
		System.out.println("PIN is Incorrect");
		System.exit(0);
		return false;
	}

	public boolean validateAccountNumberAndPassword(String accountNumberEntered, String accountNumber,
			String passwordEntered, String password) {
		if (accountNumberEntered.equals(accountNumber) && passwordEntered.equals(password)) {
			return true;
		}
		System.out.println("Account Number or Password is Incorrect");
		System.exit(0);
		return false;
	}

}
