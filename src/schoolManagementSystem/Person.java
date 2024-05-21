package schoolManagementSystem;

public abstract class Person {

	private String name;
	private int age;
	private String gender;

	public Person(String name, int age, String gender) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public String getName() {
		return name;
	}
	
	public abstract void describeRole();
}
