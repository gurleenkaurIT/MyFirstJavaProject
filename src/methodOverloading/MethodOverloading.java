package methodOverloading;

public class MethodOverloading {

	// No. of argruments different
	// Data type of arguements different
	// Position or Sequence of arguements different
	// If arguements is same and method name is same and return type of method is
	// different then all possible,
	// complier dont know which method to call

	public int sum(int a, int b) {
		int sum = a + b;
		return sum;
	}

	public String sum(int a, String b) {
		String sum = a + b;
		return sum;
	}

}
