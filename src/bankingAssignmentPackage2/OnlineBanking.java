package bankingAssignmentPackage2;

public class OnlineBanking extends BankOperations {

	@Override
	public void changePinPassword(String newPassword) {
		if (details.getPassword() != newPassword) {
			if (newPassword.contains("&") && newPassword.contains("$") && newPassword.contains("@")
					&& newPassword.length() < 8) {
				details.setPassword(newPassword);
				System.out.println("Password Updated");

			} else {
				System.out
						.println("Password should be of 8 characters and must contains &, $ and @ special characters.");
			}
		} else {
			System.out.println("Please enter different password");
		}

	}

	@Override
	public void changePinPassword(int newPin) {
		// TODO Auto-generated method stub

	}

}
