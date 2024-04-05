package conditionalOpeartions;

public class ATM {


		double balance;

		double overdraftAmount;
		int withdrawalAmount;
		int enteredPin;
		boolean isPinValid;
		int actualPin;

		/*
		 * balance > amount entered (OR) overdraftAmount>amount entered: Customer can
		 * withdraw the amount balance < amount entered: Customer cannot withdraw the
		 * amount if
		 */

		void withdrawMoneyFromAtm() {
//			boolean isBalanceEnough = (balance > amountEntered) || (overdraftAmount > amountEntered);

			if ((balance > withdrawalAmount) || (overdraftAmount > withdrawalAmount)) {
				System.out.println("Customer can withdraw the amount");
			} else {
				System.out.println("Customer does not have enough balance");
			}

		}

		void validatePinAndWithdrawMoney() {

			isPinValid = enteredPin == actualPin;

			// Condition to validate if PIN is valid
			if (isPinValid) {

				System.out.println("PIN is correct");
				// Condition to validate the withdrawal amount

				if ((balance > withdrawalAmount) || (overdraftAmount > withdrawalAmount)) {
					System.out.println("Customer can withdraw the amount");

				} else {

					System.out.println("Customer does not have enough balance");
				}
			}

		}

	}

