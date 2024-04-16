package forLoop;

public class ForLoop {

	// Array, used to store values for same data type under one variable.
	// Stores values by Index number starting from zero, so below five cities index
	// is from 0 to 4
	String[] cities = { "Brampton", "Mississauga", "Surrey", "Montreal", "Winnipeg" };
	boolean isSurreyInTheList = false;
	int maxAttemptsAllowed =3;

	void printCityNames() {
		// int i =0; First executed
		// i<4; Second executed
		// syso ; Third executed
		// ++i Fourth executed

		for (int i = 0; i < 5; i++) {
			System.out.println(cities[i]); // To print all array values

		}
		System.out.println("Second city in the list is " + cities[2]); // To Print any particular value in array
	}

	void findSurreyIsInTheList() {
		// i is the counter, it will increase every time by 1 or by any particular
		// condition if mentioned
		for (int i = 0; i < cities.length; i++) {
			if (cities[i] == "Surrey") {
				isSurreyInTheList = true;
				System.out.println("Surrey is in the list");
				break;
			}
		}

		if (!isSurreyInTheList)

		{
			System.out.println("Surrey is not in the list");
		}
	}
	// method to check maximum attempts to find Surrey
	void maxAttempts() {
		 for(int i=0;i<3;i++) {
			 System.out.println("Attempt");
			 maxAttemptsAllowed--;
		 }
		 if(maxAttemptsAllowed == 0) {
			 System.out.println("No more Attempts left");
		 }
	}
}
