package abstractionAndInterface;

public  class  CIBC  extends NationalBank implements Brokerage,ForexTransactions{

	@Override
	public void interestonSaving() {
		// TODO Auto-generated method stub
		System.out.println("Provide interest of 1 % on saving");
	}

	public  void provideLoans() {
		System.out.println("Provide loans starting from prime rate 5.5%");
	}
	

	@Override
	public void provideCheques() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void buyStocks() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sellStocks() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void chargeForEachTransction() {
		// TODO Auto-generated method stub
		System.out.println("Charge $100 for each transaction");
	}

	@Override
	public void sendMoneyGlobally() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void receiveMoneyGlobally() {
		// TODO Auto-generated method stub
		
	}

}
