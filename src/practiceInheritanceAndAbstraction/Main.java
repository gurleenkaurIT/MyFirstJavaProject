package practiceInheritanceAndAbstraction;

public class Main {

	public static void main(String[] args) {

		TwoWheeler bike = new TwoWheeler();
		bike.showPrice(); // Executed Two Wheeler method
		bike.finalPrice(); // Executed Two Wheeler method

		FourWheeler car = new FourWheeler();
		car.showPrice(); // Executed Vehicle class method
		car.finalPrice(); // Executed Four Wheeler method
		car.newChildMethod();

		Vehicle twoWheeler = new TwoWheeler();
		twoWheeler.showPrice(); // Executed Two Wheeler method
		twoWheeler.warranty();
		twoWheeler.newMthod();
		

		//fourWheeler is referring to object of TD bank
		Vehicle fourWheeler = new FourWheeler();
		fourWheeler.showPrice(); // Executed Vehicle class method
		fourWheeler.warranty();
	//	fourWheeler.n

	}
}