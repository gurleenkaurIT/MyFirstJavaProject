package variablesAndMethods;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("This is Main Class");

		// Object of Mobile Class
		MobilePhone mp = new MobilePhone();

		String nameOfColour = mp.colour; // To print the variable declared and initialized in other class
		System.out.println(nameOfColour);

		String nameMaterial = mp.material; // If variable has already a value means already initialized.And we use it in
		// other class or we need to print it through object then we need to store
		// its value into another variable of same data type.
		System.out.println(nameMaterial);

		mp.model = "15 pro max"; // initialized variable here which is declared in MobilePhone class
		String modelName = mp.model; // To print the variable initialized in this class and declared in other class,
										// we need to store in variable of same data type
		System.out.println(modelName); // to print a variable

		mp.makeCalls(); // invoked method through object

	}

}
