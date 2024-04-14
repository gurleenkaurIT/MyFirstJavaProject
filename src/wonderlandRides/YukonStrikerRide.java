package wonderlandRides;

public class YukonStrikerRide {
	
	int age;
	double height;
	double weight;
	
	void checkYukonStrikerRideEligibility() {
		
	if (age >=20 && height >=58 && weight >= 48) {
		
		System.out.println("You are eligible for Yukon Striker Ride");
	}
	else {
		System.out.println("Sorry! You didn't meet the criteria");
	}
	}

}
