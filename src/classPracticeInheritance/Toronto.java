package classPracticeInheritance;

public class Toronto extends OntarioProvince {

	public Toronto() {
		super();
	}

	public Toronto(int noOftouristDestination, String population) {
		super(noOftouristDestination, population);
	}

	public void population() {
		System.out.println("Population of Toronto " + population);
	}

	
	public void numberOfTouristDestination() {
		System.out.println("Tourist Destinations is Toronto is: " + noOftouristDestination);
	}
	
	public void currentTime() {
		System.out.println("Print time in Toronto");
	}

}
