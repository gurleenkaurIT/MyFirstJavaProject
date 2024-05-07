package abstractionAndInterface;

public class RBC implements NBankInterface,CRA{

	@Override
	public void interestonSaving() {
		// TODO Auto-generated method stub
		System.out.println("Provide 1% interest on saving");
	}

	@Override
	public void provideCheques() {
		// TODO Auto-generated method stub
		System.out.println("Provide 5 cheques initially");
	}

	@Override
	public void provideLoans() {
		// TODO Auto-generated method stub
		System.out.println("provide loan at 5.2 %");
	}

	@Override
	public void linkAccountToSIN() {
		// TODO Auto-generated method stub
		System.out.println("Accounts linked to SIN ");
	}

}