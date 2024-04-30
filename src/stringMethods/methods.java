package stringMethods;

public class methods {

	public static void main(String[] args) {

		String first = "Gurleen";
		String second = "kaur";
		String third = "KAur";

		// Append a string at the end of another string
		System.out.println("Strings after concatination : " + first.concat( second));
		System.out.println("Strings after concatination : "+ second.concat(first));
		
		// Check if string contains this characters, returns boolean value
		System.out.println("String contains " + first.contains("E"));
		System.out.println("String contains " + first.contains("e"));
		
		// string contains the exact same sequence of characters
		System.out.println("Strings are Equal " +second.equals(third));
		System.out.println("Strings are Equal " + second.equalsIgnoreCase(third));
		
		
//		System.out.println("Compare to " + second.compareTo(third));
//		System.out.println("Compare to " + second.compareToIgnoreCase(third));
		
		// Character at the index
		System.out.println("Char at Index :" + second.charAt(2));
		System.out.println("Ends with letter : " + first.endsWith("n"));
		System.out.println("Index of : "+ first.indexOf("r"));
		System.out.println("Is Empty : " + third.isEmpty());
		System.out.println("Is Blank : " + third.isBlank());
		System.out.println("To uppercase: " + second.toUpperCase());
	}

}
