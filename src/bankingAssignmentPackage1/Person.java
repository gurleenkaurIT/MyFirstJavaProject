package bankingAssignmentPackage1;

public class Person {

	private String accountNumber = "123";
	private double fundsAvailable = 20000;
	private int pin = 1234;
	private String password = "Gur123";

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
		password = "Gur123";
		this.password = password;
	}

}
