package schoolManagementSystem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Teacher extends Person {

	private String employeeID;
	private int salary;
	
	private Set<String> coursesTaught = new HashSet<String>();
	private ArrayList<Integer> rating = new ArrayList<Integer>();

	public Teacher(String name, int age, String gender, String employeeID, int salary, Set<String> coursesTaught,
			ArrayList<Integer> rating) {
		super(name, age, gender);
		this.employeeID = employeeID;
		this.salary = salary;
		this.coursesTaught = coursesTaught;
		this.rating = rating;
	}
	
	public Teacher(String name, int age, String gender, String employeeID, int salary) {
		super(name, age, gender);
		this.employeeID = employeeID;
		this.salary = salary;
	}

	public void addCourses(String courseTaught) {
		coursesTaught.add(courseTaught);
	}

	@Override
	public void describeRole() {
		System.out.println("Teacher");

	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void addRating(int ratings) {
		rating.add(ratings);
	}

	public double calculateAverageRating() {
		double ratingsSum = 0;
		for (int ratingEntered : rating) {
			ratingsSum = ratingEntered + ratingsSum;
		}
		double totalRatings = rating.size();
		double avergeRating = ratingsSum / totalRatings;
		return avergeRating;

	}

}
