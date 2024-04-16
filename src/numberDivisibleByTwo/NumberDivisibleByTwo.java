package numberDivisibleByTwo;

public class NumberDivisibleByTwo {

	int[] numbers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

	void numbersDivisibleByTwo() {
		for (int i = 0; i < 10; i++) {
			if (numbers[i] % 2 == 0) {
				System.out.println(numbers[i] + " is divisble by 2");
			}
		}
	}
}
