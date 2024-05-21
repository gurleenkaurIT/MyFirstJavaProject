package collectionsInterface;

import java.util.ArrayList;

public class ArrayListInterface {

	public static void main(String arg[]) {

		// Syntax of creating an array list
		ArrayList<String> cities = new ArrayList<String>();

		cities.add("Toronto");

		cities.add("Brampton");

		cities.add("Mississauga");

		cities.add("Toronto"); // adds duplicate values

		System.out.println("Size of the list :" + cities.size());

		for (int i = 0; i < cities.size(); i++) {

			System.out.println(cities.get(i));
		}

		// Add any city at particular index and push the element that was previously at
		// that index

		cities.add(1, "Hamilton");

		System.out.println("______________________________________________________-");

		for (int i = 0; i < cities.size(); i++) {

			System.out.println(cities.get(i));
		}

		// Replace the element with new element at the same index
		cities.set(3, "Caldeon"); // replacing mississauga with caledon

		System.out.println("______________________________________________________-");

		for (int i = 0; i < cities.size(); i++) {

			System.out.println(cities.get(i));
		}
		
		// Search the element in the array
		System.out.println("Mississauga in the list: " +cities.contains("Mississauga"));
		
		System.out.println("______________________________________________________-");
		
		System.out.println("SubList: "+cities.subList(0, 3));
		System.out.println("SubList: "+cities.subList(0, 3).toString());
		
		cities.get(2);// to get the element at particular index
		
		System.out.println("Index: "+cities.indexOf("Toronto"));// Returns the index at first occurrence
		
		System.out.println("Index: "+cities.lastIndexOf("Toronto"));// Returns the index at last occurrence
	}
}
