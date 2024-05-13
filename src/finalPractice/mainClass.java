package finalPractice;

public class mainClass {

	public static void main(String args[]) {

		childClass pc = new childClass();
		pc.st = 123;
		System.out.println("non final varible in final class" + pc.st);
	}
}
