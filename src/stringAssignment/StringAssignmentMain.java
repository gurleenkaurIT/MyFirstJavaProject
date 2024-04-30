package stringAssignment;

import java.util.Scanner;

public class StringAssignmentMain {

	public static void main(String[] args) {

		StringAssignment stringAssignment = new StringAssignment();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String: ");
		String enteredString = sc.next();

		stringAssignment.numberOfSyllabes(enteredString);
		stringAssignment.removeFirstAndLast(enteredString);

		System.out.println("Enter First Name: ");
		String enteredFirstName = sc.next();
		System.out.println("Enter Last Name: ");
		String enteredLastName = sc.next();

		stringAssignment.swapFirstAndLastName(enteredFirstName, enteredLastName);

		System.out.println("Enter Prefix: ");
		String prefix = sc.next();
		stringAssignment.isPrefixPresent(enteredString, prefix);

		System.out.println("Enter Suffix: ");
		String suffix = sc.next();
		stringAssignment.isSuffixPresent(enteredString, suffix);

		String enteredCity = "[Last Day!] Beer Festival [Munich]";
		stringAssignment.grabCity(enteredCity);

		sc.close();
	}

}
