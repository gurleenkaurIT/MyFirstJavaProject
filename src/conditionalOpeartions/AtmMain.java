package conditionalOpeartions;

public class AtmMain {

	public static void main(String[] args) {

		ATM atm = new ATM();

		atm.balance = 6567.89;

		atm.withdrawalAmount = 5000;

		atm.overdraftAmount = 5000;
		atm.withdrawMoneyFromAtm();

	}
}
