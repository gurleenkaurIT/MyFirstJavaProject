package banquetAssignment;

import java.util.Scanner;

public class BanquetMain {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		Banquet banquet = new Banquet();

		System.out.println("Enter Booking Base Cost: ");
		double baseCost = sc.nextDouble();

		System.out.println("Enter Food Cost: ");
		double foodCost = sc.nextDouble();

		System.out.println("Enter Beverages Cost: ");
		double beveragesCost = sc.nextDouble();

		System.out.println("Enter any Tip given: ");
		double tipGiven = sc.nextDouble();

		double totalBaseCost = banquet.calculateBaseCost(baseCost, foodCost, beveragesCost, tipGiven);

		System.out.println("Enter Base Cost Tax Percentage: ");
		double baseCostTaxPercentage = sc.nextDouble();

		double totalCalculatedTax = banquet.calculateTax(baseCostTaxPercentage, totalBaseCost);

		System.out.println("Enter Guest Count: ");
		int guestCount = sc.nextInt();

		double totalCalcuatedCess = banquet.calculateCess(guestCount, totalBaseCost);

		banquet.calculateTheTotalCost(totalBaseCost, totalCalculatedTax, totalCalcuatedCess);
	}

}
