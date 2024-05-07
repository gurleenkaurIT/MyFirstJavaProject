package classPracticeInheritance;

public class Windsor extends OntarioProvince {



	public Windsor(int noOftouristDestination, String population) {
		super(noOftouristDestination, population);

	}

	public void population() {
		System.out.println("Population of Windsor " + population);
	}

	public void numberOfTouristDestination() {
		System.out.println("Tourist Destinations is Windsor is: " + noOftouristDestination);
	}

	public boolean hasBorder(boolean borderUSCanada) {
		if (borderUSCanada) {
			System.out.println("Windsor has a US border ");
			return true;
		}
		return false;

	}
}
