package practiceInheritanceAndAbstraction;

class FourWheeler extends Vehicle {

	double increasePriceBy = 1; // 1 times

	void finalPrice() {
		basePrice = basePrice + (basePrice * increasePriceBy);
		System.out.println("After modification, The price of car is: Rs." + basePrice);
	}

	@Override
	public void warranty() {
		System.out.println("Give two Years Warranty");
	}
		public void newChildMethod() {
		}
	
		
	}
