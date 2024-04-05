package arithmaticOperations;

public class Operations {

	int n1 = 20;
	int n2 = 10;
	int result;

	/*
	 * We have five arithmatic operations addition, subtract, multiply, division is
	 * divided into two parts : quotient / and remainder %
	 */
	void addTwoNumbers() {
		result = n1 + n2;
		System.out.println("Sum. of two numbers: " + result); // String concatination ("  " + "")  by using + sign
	}

	void subtractTwoNumbers() {
		result = n1 - n2;
		System.out.println(result);
	}

	void multipleTwoNumbers() {
		result = n1 * n2;
		System.out.println(result);
	}

	void getQuotientOfTwoNumbers() {
		result = n1 / n2;
		System.out.println(result);
	}

	void getRemainderOfTwoNumbers() {
		result = n1 % n2;
		System.out.println(result);
	}
	
	void incrementValueByOne() {
		result = ++n1;
		System.out.println(result);
	}
	
	void decrementValueByOne() {
		result = --n2;
		System.out.println(result);
	}
}
