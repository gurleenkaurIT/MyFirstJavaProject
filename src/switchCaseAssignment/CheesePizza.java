package switchCaseAssignment;

import java.util.Scanner;

/*
 * Write a program to prepare the bill for a pizza shop. Assume an order and
 * work out the final bill. Take the Cheese Pizza prices as: Small Pizza: $15,
 * Medium Pizza: $20, Large Pizza: $25 For additional pepperoni topping:
 * Pepperoni for Small Pizza: +$2, Pepperoni for Medium or Large Pizza: +$3
 * Extra cheese for any size pizza: + $1 For eg: If the Pizza is medium,
 * pepperoni with extra cheese the program should calculate the final bill as
 * 20+3+1 = $24 and print as “Your final bill is $24”
 */

public class CheesePizza {

	int smallPizzaPrice = 15;
	int mediumPizzaPrice = 20;
	int largePizzaPrice = 25;
	int pepperoniAddedInSmallPizza = 2;
	int cheeseAdded = 1;
	int pepperoniAdded = 3;
	int sum = 0;
	String pepperoni;
	String cheese;
	Scanner sc = new Scanner(System.in);

	void pizzaBill() {

		System.out.println("Enter the Pizza Size : ");
		String pizzaSize = sc.next();

		switch (pizzaSize) {
		case "Small":
			sum = sum + smallPizzaPrice;

			System.out.println("Would You like to add Pepperoni :");
			pepperoni = sc.next();

			if (pepperoni.equalsIgnoreCase("Yes")) {
				sum = sum + pepperoniAddedInSmallPizza;
			}
			
			System.out.println("Would You like to add Cheese :");
			cheese = sc.next();

			if (cheese.equalsIgnoreCase("Yes")) {
				sum = sum + cheeseAdded;
			}

			break;

		case "Medium":
			sum = sum + mediumPizzaPrice;

			System.out.println("Would You like to add Pepperoni :");
			pepperoni = sc.next();

			if (pepperoni.equalsIgnoreCase("Yes")) {
				sum = sum + pepperoniAdded;
			}

			System.out.println("Would You like to add Cheese :");
			cheese = sc.next();

			if (cheese.equalsIgnoreCase("Yes")) {
				sum = sum + cheeseAdded;
			}

			break;

		case "Large":
			sum = sum + largePizzaPrice;

			System.out.println("Would You like to add Pepperoni :");
			pepperoni = sc.next();

			if (pepperoni.equalsIgnoreCase("Yes")) {
				sum = sum + pepperoniAdded;
			}

			System.out.println("Would You like to add Cheese :");
			cheese = sc.next();

			if (cheese.equalsIgnoreCase("Yes")) {
				sum = sum + cheeseAdded;
			}

			break;

		default:
			System.out.println("Please enter valid pizza size");
			break;
		}
		
		System.out.println("Youe final pizza Bill is : $" + sum);
	}

}
