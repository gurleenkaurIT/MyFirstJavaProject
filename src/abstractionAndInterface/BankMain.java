package abstractionAndInterface;

public class BankMain {

	public static void main(String arg[]) {

		// Cannot create object of Abstract class
		/*
		 * NationalBank nationalBank = new NationalBank() ;
		 * nationalBank.interestonSaving();
		 */

		TDBank tdbank = new TDBank();
		tdbank.interestonSaving();
		tdbank.provideLoans();
		tdbank.provideCheques();

		System.out.println("_________________________");

		// nb is referring to object of TD bank
		NationalBank nb = new TDBank();

		// Child class method - It'an abstract method in superclass, we cannot run the
		// unimplemented method,
		// but the child class has an implementation that's why i am invoking overridden
		// child class method

		nb.interestonSaving();

		nb.provideLoans();// Child class or parent class
		// Child Class, overridden method

		System.out.println("RBC Methods___________________________");

		RBC rbc  = new RBC();
		rbc.interestonSaving();
		rbc.method1();
		rbc.linkAccountToSIN();
		
		System.out.println("NbankInterface Ref variable___________________________");
		NBankInterface rbc2 = new RBC();
		rbc2.interestonSaving();
		rbc2.method1();
		rbc2.provideCheques();
		rbc2.provideLoans();
	//	rbc2.linkAccountToSIN() - Cannot access method from another interface because the reference variable is not of CRA but NBankInterface.
		
		System.out.println("CRA Ref variable___________________________");
		CRA rbc3 = new RBC();
		rbc3.linkAccountToSIN();
		
		
		FinancialTransactions rbc4 = new RBC();
		
		rbc4.interestonSaving();
		rbc4.linkAccountToSIN();

	}
}
