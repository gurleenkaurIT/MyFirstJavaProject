package wonderlandRides;

public class RidesMain {

	public static void main(String[] args) {

		LeviathanRide leviathanRide = new LeviathanRide();
		leviathanRide.age = 15;
		leviathanRide.height = 59;
		leviathanRide.weight = 50;
		leviathanRide.checkLeviathanRideEligibility();
		BehemothRide behemothRide = new BehemothRide();
		behemothRide.age = 19;
		behemothRide.height = 56;
		behemothRide.weight = 47;
		behemothRide.checkBehemothRideEligibility();
		YukonStrikerRide yukonStrikerRide = new YukonStrikerRide();
		yukonStrikerRide.age = 21;
		yukonStrikerRide.height = 59;
		yukonStrikerRide.weight = 35;
		yukonStrikerRide.checkYukonStrikerRideEligibility();

	}

}
