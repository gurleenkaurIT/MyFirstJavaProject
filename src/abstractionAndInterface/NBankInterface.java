package abstractionAndInterface;

public interface NBankInterface extends FinancialTransactions{

	//Interface is an Entity where all methods are by default abstract
	String name = "NationalBank";
	
	
//	public void interestonSaving();
//
//	public void provideCheques();
//
//	public void provideLoans();
	public default void method1() {
		System.out.println("Inside default ");
	}
	
	
}