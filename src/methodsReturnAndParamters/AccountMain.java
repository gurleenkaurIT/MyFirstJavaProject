package methodsReturnAndParamters;

import java.util.Scanner;

public class AccountMain {

	public static void main(String[] args) {

		Account jerinAccount = new Account();
		jerinAccount.accountNumber = "123456789";
		jerinAccount.nameOFAccountHolder = "Jerin Raj";
		jerinAccount.accountType = "Chequing";
		jerinAccount.balance = 4567.89;
		jerinAccount.pin = 1234;

		//String accountNumber = jerinAccount.getAccountNumber();
		System.out.println("Jerin Account: " + jerinAccount.getAccountNumber());

		Account ravneetAccount = new Account();
		ravneetAccount.accountNumber = "987456321";
		ravneetAccount.nameOFAccountHolder = "Ravneet Kaur";
		ravneetAccount.accountType = "Savings";
		ravneetAccount.balance = 6541.23;
		ravneetAccount.pin = 4321;

		Account rajinderAccount = new Account();
		rajinderAccount.accountNumber = "456789123";
		rajinderAccount.nameOFAccountHolder = "Rajinder Kaur";
		rajinderAccount.accountType = "Savings";
		rajinderAccount.balance = 100000;
		rajinderAccount.pin = 7890;

//		String[] names = {"Prabhjot", "Arshpreet", "Arshdeep"};

		Account[] accounts = { jerinAccount, ravneetAccount, rajinderAccount };

		// balance of jerinAccount

		System.out.println(accounts[0].getBalance());
		System.out.println(accounts[2].getBalance());

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your account number");

		String accountNumEntered = sc.next();
		System.out.println("Enter your Pin Number");
		int pinEntered = sc.nextInt();
//		for (int i = 0; i < accounts.length; i++) {
//			if (accounts[i].getAccountNumber().equals(accountNumEntered)) {
//				boolean isPinValid = accounts[i].validatePin(pinEntered);
//				if (isPinValid) {
//					System.out.println("Account Holder Name: " + accounts[i].getNameOfAccountHolder());
//					System.out.println("Type Of Account: " + accounts[i].getAccountType());
//					System.out.println("Account Balance: " + accounts[i].getBalance());
//					
//				}else {
//					System.out.println("Pin is not correct");
//				}
//				break;
//			}
//
//		}
		
		
		//boolean isAccountValidated = false;
//		for (int i = 0; i < accounts.length; i++) {
//
//			if (accounts[i].validateCredentials(accountNumEntered, pinEntered)) {
//				System.out.println("Account Holder Name: " + accounts[i].getNameOfAccountHolder());
//				System.out.println("Type Of Account: " + accounts[i].getAccountType());
//				System.out.println("Account Balance: " + accounts[i].getBalance());
//				isAccountValidated = true;
//				break;
//			}
//		}
//		if (!isAccountValidated) {
//			System.out.println("Account Details are not correct");
//		}

		Account account = new Account();
		account = account.getAccountIfValidCredentials(accountNumEntered, pinEntered, accounts);
	//	account.displayAccountDetails();
		rajinderAccount.displayAccountDetails();
		account.getAccountNumber();
		
		sc.close();
	}

}