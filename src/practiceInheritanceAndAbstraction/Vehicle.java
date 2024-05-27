package practiceInheritanceAndAbstraction;

public abstract class Vehicle {

	double basePrice = 100000;

	public void showPrice() {
		System.out.println("The price of Vehicle is: Rs." + basePrice);
		System.out.println("Show Price method in Vehicle class");
	}
	
	public abstract void warranty();
	
	public void newMthod() {
		
	}
}
