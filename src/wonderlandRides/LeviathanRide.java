package wonderlandRides;

public class LeviathanRide {

	int age;
	double height;
	double weight;

	void checkLeviathanRideEligibility() {

		if (age >= 18 && height >= 56 && weight >= 46) {

			System.out.println("You are eligible for Leviathan Ride");
		}
		
		else {
			System.out.println("Sorry! You didn't meet the criteria");
		}
	}

}
