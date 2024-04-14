package incrementAndDecrementOperators;

public class IncrementAndDecrementMain {

	public static void main(String[] args) {
		IncrementAndDecrementOperator incOperator = new IncrementAndDecrementOperator();
		incOperator.preIncrement(); // ++a
		incOperator.postIncrement(); // a++

		incOperator.postDecrement(); // a--
		incOperator.preDecrement(); // --a

	}

}
