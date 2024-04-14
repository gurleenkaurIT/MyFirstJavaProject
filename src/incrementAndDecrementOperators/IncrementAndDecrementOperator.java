package incrementAndDecrementOperators;

public class IncrementAndDecrementOperator {

	int a = 5;
	int b = 7;

	void preIncrement() {
		System.out.println("Value of a is:" + a);
		int x = b + ++a; // a value will increment first and then b + a expression will happen
		System.out.println("Value of x for Pre Icrement is : " + x);
		System.out.println("Value of a is:" + a);
	}

	void postIncrement() {
		System.out.println("Value of a is:" + a);
		int x = b + a++; // b+a expression will execute first and then a value will be incremented
		System.out.println("Value of x for Pre Icrement is : " + x);
		System.out.println("Value of a is: " + a);

	}

	void preDecrement() {
		System.out.println("Value of a is:" + a);
		int x = b + --a; // a value will decrement first and then b + a expression will happen
		System.out.println("Value of x for Pre Icrement is : " + x);
		System.out.println("Value of a is:" + a);
	}

	void postDecrement() {
		System.out.println("Value of a is:" + a);
		int x = b + a--; // // b+a expression will execute first and then a value will be decremented
		System.out.println("Value of x for Pre Icrement is : " + x);
		System.out.println("Value of a is:" + a);
	}
}
