package stringAssignment;

import java.util.Arrays;

public class StringAssignment {

	// Create a function that counts the number of syllables a word has. Each
	// syllable is separated with a dash
	public void numberOfSyllabes(String stringEntered) {

		if (!stringEntered.isEmpty()) {

			if (stringEntered.contains("-")) {

				String[] totalSyllabes = stringEntered.split("-");
				System.out.println(Arrays.toString(totalSyllabes));

				System.out.println("Total numbers of Syllabes are: " + totalSyllabes.length);

			} else {
				System.out.println("String doesnot contain any Syllabes");
			}
		}

	}

	// Write a function to return the city from each of these vacation spots
	public String grabCity(String enteredVacationSpot) {

		if (enteredVacationSpot.contains("]") && enteredVacationSpot.contains("[")) {

			String city = enteredVacationSpot.substring((enteredVacationSpot.lastIndexOf("[") + 1),
					enteredVacationSpot.lastIndexOf("]"));
			System.out.println(city);

			return city;

		}
		System.out.println("City not found");
		return null;

	}

	// Create a function that removes the first and last characters from a string
	public void removeFirstAndLast(String stringEntered) {

		if (!stringEntered.isEmpty()) {

			int stringLength = stringEntered.length();

			if (stringLength <= 2) {

				System.out.println("String " + stringEntered
						+ " has two or less characters. So, can't remove First and Last Characters.");
			} else {

				System.out.println("String after removing first and last Character: "
						+ stringEntered.substring(1, stringLength - 1));
			}
		}
	}

	// Create a method that accepts a string (of a person's first and last name) and
	// returns a string with the first and last name swapped
	public void swapFirstAndLastName(String firstName, String lastName) {

		if (!firstName.isEmpty() && !lastName.isEmpty()) {
			System.out.println("First Name and Last Name before swapping is : " + firstName + " " + lastName);

			String temp = firstName;
			firstName = lastName;
			lastName = temp;
			System.out.println("First Name and Last Name after swapping is : " + firstName + " " + lastName);

		}
	}
	// Create two functions: isPrefix(word, prefix-) and isSuffix(word, -suffix).
	// isPrefix should return true if it begins with the prefix argument.
	// isSuffix should return true if it ends with the suffix argument.
	// Otherwise return false.

	public boolean isPrefixPresent(String word, String prefix) {

		if (word.startsWith(prefix)) {
			System.out.println("String " + word + " has prefix " + prefix);
			return true;
		}
		System.out.println("String doesn't have a prefix");
		return false;
	}

	public boolean isSuffixPresent(String word, String suffix) {

		if (word.endsWith(suffix)) {
			System.out.println("In String " + word + " has suffix " + suffix);
			return true;
		}
		System.out.println("String doesn't have a suffix");
		return false;
	}

}
