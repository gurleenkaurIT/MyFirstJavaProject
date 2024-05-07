package classPracticeInheritance;

public class OntarioProvince {

	protected int noOftouristDestination;
	protected String population;

	// We declare for String as as well And string is also a class so we can create
	// variable of any class
	// Composition: has a relation, one class has variable of other class
	public CustomerReviews reviews; // Class name variable name or // Object of the class

	// Parameterized Constructor
	public OntarioProvince(int noOftouristDestination, String population) {
		super();
		this.noOftouristDestination = noOftouristDestination;
		this.population = population;

	}

	// Non - Parameterized Constructor
	public OntarioProvince() {

	}

	public void rulesForOntario() {
		System.out.println("G Class licenses");
		System.out.println("Provincial Tax 13%");
	}

	public void currentTime() {
		System.out.println("Print time in all over Ontario");
	}

	public void customerReviews() {

	}
}
