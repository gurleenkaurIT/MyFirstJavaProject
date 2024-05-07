package abstractionAndInterface;

public abstract class NationalBank {

	//Abstract class is a class which has one or more abstract methods
	
	double balance;
	
	// Non abstract method
	public void provideLoans() {
		System.out.println("Provide loans starting from prime rate 5%");
	}
	
	//An abstract method does not have a body (curly braces {}) and ends in a semicolon and abstract keyword is appened to it
	public abstract void interestonSaving();
	
	public abstract void provideCheques();
	
}