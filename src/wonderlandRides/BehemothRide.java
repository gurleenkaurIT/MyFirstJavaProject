package wonderlandRides;

public class BehemothRide {
	
	int age;
	double height;
	double weight;

	void checkBehemothRideEligibility() {

		if (age >= 16 && height >= 54 && weight >= 44) {

			System.out.println("You are eligible for Behemoth Ride");
		}
		else {
			System.out.println("Sorry! You didn't meet the criteria");
		}
	}

}
