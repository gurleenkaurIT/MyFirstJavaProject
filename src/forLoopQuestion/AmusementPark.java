package forLoopQuestion;

import java.util.Scanner;

public class AmusementPark {

	Scanner sc = new Scanner(System.in);
	int maxRideCapacity = 10;
	boolean isRideFull = false;

	void rideCapacity() {
		System.out.println("How many people are already in the ride : ");
		int peopleInRide = sc.nextInt();

		for (int numberOfPeople = peopleInRide; numberOfPeople < 10;) {
			System.out.println("Next in line, Please enter your Height :");

			double height = sc.nextDouble();

			if (height > 90 && height < 200) {
				System.out.println("You meets the minimum height criteria. Please enjoy the ride.");
				numberOfPeople++;
				isRideFull = true;

			} else {
				System.out.println("Sorry! You didn't meet the minimum height criteria for ride");

			}

			if (numberOfPeople == maxRideCapacity) {
				System.out.println("Ride is Full !!");
			}
		}
		if (!isRideFull) {
			System.out.println("Ride is Full !!");
		}
	}
}
