package practiceInheritanceAndAbstraction;

class TwoWheeler extends Vehicle {

	double increasePriceBy = 0.20; // 0.2 times

	void finalPrice() {
		basePrice = basePrice + (basePrice * increasePriceBy);
		System.out.println("After modification, The price of bike is: Rs." + basePrice);
	}

	public void showPrice() {
		System.out.println("Show Price method in Two Wheeler");
	}

	@Override
	public void warranty() {
		System.out.println("Give 1 year Warranty");
		
	}
}