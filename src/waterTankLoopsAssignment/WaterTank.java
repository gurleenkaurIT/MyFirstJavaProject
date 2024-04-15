package waterTankLoopsAssignment;

import java.util.Scanner;

public class WaterTank {

	Scanner sc = new Scanner(System.in);

	void fillWaterTank() {

		System.out.println("Current water level in the tank is :");
		int waterInTank = sc.nextInt();

		if (waterInTank != 100 && waterInTank < 100) {

			System.out.println("Water level in the Tank is : " + waterInTank + " Litres");

			for (int bucket = waterInTank; bucket < 100;) {

				System.out.println("Would you like to add more water : ");
				String addMoreWater = sc.next();

				if (addMoreWater.equalsIgnoreCase("Yes")) {

					bucket = bucket + 10;
					System.out.println("Water level reached " + bucket + " litres in the tank");
				}

				else {
					System.out.println("Water in Tank is : " + bucket + " litres");
					break;
				}

				if (bucket == 100) {
					System.out.println("You have reached maximum Tank Capacity. More water can't be added !!");

				}

			}

		} else {
			System.out.println("Water Tank is full !!");
		}
	}
}
