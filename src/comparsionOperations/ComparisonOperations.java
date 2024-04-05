package comparsionOperations;

public class ComparisonOperations {

	int a = 20;// int a and int b are class level variables, can be used by any method of the
				// class
	int b = 15;
	boolean result = false; // By Default value is False

	public void isAGreaterThanB() {
		int c = 10; // int c is method level variable, declared and initialized inside method and
					// can be used inside scope of the variable only
		result = a > b; // > Greater than sign
		System.out.println("Is A greater than B :" + result);
		result = b > c;
		System.out.println("Is B greater than C :" + result);

	}

	public void isAGreaterThanOrEqualToB() {
		result = a >= b;// >= greater than or equals to sign
		System.out.println("Is A greater than B :" + result);
	}

	public void compareTwoNumbers() {
		result = a == b;// = equals To sign assign the value of right side variable to the right side
						// variable and == is used to compare the values of two variables.

		System.out.println("Is A equal to B :" + result);
	}

	public void notEqualTwoNumbers() {
		result = a != b;

		System.out.println("Is A not equals to B :" + result);
	}
}
