package forLoopQuestion;

import java.util.Scanner;

public class AmusementPark {

	
	Scanner sc = new Scanner(System.in);

	void rideCapacity() {

		
		
		for (int i = 1;
				i <= 10;
				i++) {
			
			System.out.println("Please enter the Height :");
			double height = sc.nextDouble();
			
			
			if (height > 90 && height < 200) {
				System.out.println("You meets the minimum height criteria for ride");
			}

			else {
				System.out.println("Sorry! You didn't meet the minimum height criteria for ride");
			}
		}

	}
}
