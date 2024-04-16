package returnMethods;

public class ReturnMethod {

	int num1 = 10;
	int num2 = 20;

	public void addTwoNumbers() {
		int sum = num1 + num2;
		System.out.println("Sum of two numbers is : " + sum);

	}
	
	public int sumOfTwoNumbers() {
		int sum = num1 + num2;
		return sum;
	}
}
