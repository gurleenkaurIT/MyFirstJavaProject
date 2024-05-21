package collectionsInterface;

import java.util.HashSet;

public class HashSetInterface {
	
	public static void main(String[] args) {

		HashSet<String> cities = new HashSet<String>();

		cities.add("Toronto");

		cities.add("Brampton");

		cities.add("Mississauga");

		cities.add("Caledon");
		
		cities.add("Caledon"); // Don't add duplicate values

		System.out.println("Size of the list :" + cities.size()); // size is four

	}
}
