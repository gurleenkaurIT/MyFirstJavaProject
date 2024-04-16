package waterTankLoopsAssignment;

/*There is a water tank of capacity 100 litres. Water is filled into it using bucket which have capacity of 10 litres. 
 *  Write a program which fills the tank to its capacity using these buckets. 
 *  Also include a mechanism in your program to stop the tank from over flowing
 */

import java.util.Scanner;

public class WaterTank {

	int maxTankCapacity = 100;

	Scanner sc = new Scanner(System.in);

	void fillWaterTank() {

		System.out.println("How much water is in the tank :");
		int waterInTank = sc.nextInt();

		if (waterInTank != maxTankCapacity && waterInTank < maxTankCapacity) {

			System.out.println("Water level in the Tank is : " + waterInTank + " Litres");

			for (int bucket = waterInTank; bucket < maxTankCapacity;) {

				System.out.println("Would you like to add more water : ");
				String addMoreWater = sc.next();

				if (addMoreWater.equalsIgnoreCase("Yes")) {

					System.out.println("How much water would you like to add :");
					int waterAdded = sc.nextInt();

					bucket = bucket + waterAdded;

					if (bucket >= maxTankCapacity) {
						System.out.println("You have reached maximum Tank Capacity. More water can't be added !!");

					} else {
						System.out.println("Water level reached " + bucket + " litres in the tank");
					}

				}

				else {
					System.out.println("Water in Tank is : " + bucket + " litres");
					break;
				}

			}

		} else {
			System.out.println("Water Tank is full !!");
		}
	}
}
