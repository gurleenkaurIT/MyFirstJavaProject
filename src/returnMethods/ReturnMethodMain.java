package returnMethods;

public class ReturnMethodMain {

	public static void main(String[] args) {
		 ReturnMethod rm = new ReturnMethod();
		 rm.addTwoNumbers();
		int sumOfNumbers = rm.sumOfTwoNumbers();
		System.out.println("Sum is : "+sumOfNumbers);
	}
}
