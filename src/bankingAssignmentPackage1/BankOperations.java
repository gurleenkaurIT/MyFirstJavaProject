package bankingAssignmentPackage1;
/*Assignment Part 1 :
1.	Create a Bank Operations class which has two methods withdraw, deposit, view Balance.
2.	Create 2 Classes ATM and Online Banking, both of these classes extend Bank Operations
3.	Create a class which takes care of Persons account details.
Person class should have details such as bank account no., name of account holder, total funds available, pin and 
onlineBankingPassword.

4.	Create a Main class which takes input from user and perform required operation on the type of banking service
 the user want, ATM and Online Banking.

User should be allowed to perform only single operation (deposit cash,withdraw cash etc) 
For every transaction, user must have to enter pin or banking password and that pin must be validated before allowing the 
transaction. 

Action that user intends to do (Like deposit cash or withdraw) must be asked after validating the pin. Initial user deposit 
can be kept as constant value.


User should be given Information after every transaction on the amount of balance left in account.
NOTE :
•	Use private access modifier
•	Use parent class reference variable
Assignment Part 2 : 
Abstract classes.
Make Bank Operations class abstract and  add a abstract method changePinPassword.
Overide the changePinPassword method in ATM class  which will allow user to update the pin. Before setting the new pin 
check it is not same as old pin and is not less than 4 characters

Override changePinPassword method in OnlineBanking Class. While changing the password ensure following conditions
Password is not same as old password
One should not be allowed to set password if it is less than 8 characters and have these special characters (&,$, @)
Assignment Part 3 : 
Change BankOperations class to interface and make all the methods in it abstract.
Create an abstract class BankingRules which will be extended by ATM and Online Banking with methods on daily withdrawal 
limit allowed, no. of transaction allowed.
Once user enters the application, it should request user for which type of service they would like to perform 
(ATM or Online Banking)

User should be allowed to perform unlimited transaction and UI should respond to user input in appropriate way. 
Like if user has insufficient funds and user is trying to withdraw amount, application should tell user that funds are low, 
please deposit and all similar scenario. 

Action that user intends to do (Like deposit cash or withdraw) must be asked after validating the pin. Initial user deposit
 should get updated after every transaction and each transaction must be performed on last updated balance.


User should be given Information after every transaction on the amount of balance left in account.

If user enters the pin for atm wrong 3 times, application should immediately terminate with a message showing that account 
is locked.

Similarly, if a user input internet banking password incorrectly 3 times, 
application should immediately terminate with a message showing that account is locked.

In both of these scenario, counter to keep a track of the unsuccessful attempt should get reset if user enter correct
 pin or password on 2nd or 3rd attempt.

User should have ability to continue or exit the application.
 */

public class BankOperations {

	Person details;

	public void withdrawAmount(double amountWithdrawn) {
		System.out.println("This is Bank Operations withdraw method");
	}

	public void depositAmount(double amountDeposited) {
		System.out.println("This is Bank Operations deposit method");
	}

	public void viewBalance() {
		System.out.println("Balance is : " + details.getFundsAvailable());
	}

	public boolean validatePin(int pinEntered) {
		if (pinEntered != details.getPin()) {
			System.out.println("PIN is Incorrect. Please start over.");
			System.exit(0);
		}
		return true;
	}

	public boolean validateAccountNumberAndPassword(String accountNumberEntered, String passwordEntered) {
		if (details.getAccountNumber().equals(accountNumberEntered) && details.getPassword().equals(passwordEntered)) {
			return true;
		}
		System.out.println("Account Number or Password is Incorrect. Please start over.");
		System.exit(0);
		return false;
	}
}
