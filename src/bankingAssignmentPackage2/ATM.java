package bankingAssignmentPackage2;

public class ATM extends BankOperations {

	@Override
	public void changePinPassword(int newPin) {
		if (details.getPin() != newPin) {
			int length = String.valueOf(newPin).length();
			if (length == 4) {
				details.setPin(newPin);
				System.out.println("PIN updated");
			} else {
				System.out.println("PIN must contain 4 digits");
			}

		} else {
			System.out.println("Please enter different PIN.");
		}

	}

	@Override
	public void changePinPassword(String newPassword) {
		// TODO Auto-generated method stub

	}

}
