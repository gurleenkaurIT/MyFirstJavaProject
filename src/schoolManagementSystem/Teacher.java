package schoolManagementSystem;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Teacher extends Person {

	private String employeeID;
	private int salary;
	private ArrayList<Integer> rating;

	SchoolClass school;

	public Teacher(String name, int age, String gender, String employeeID, int salary) {
		super(name, age, gender);
		this.employeeID = employeeID;
		this.salary = salary;
		this.rating = new ArrayList<Integer>();
	}

	@Override
	public void describeRole() {
		System.out.println(getName() + " is a Teacher");
	}

	public String getEmployeeID() {
		return employeeID;
	}

	public void addRating(int ratings) {
		if (ratings > 0 && ratings < 6) {
			rating.add(ratings);
		} else {
			System.out.println("Ratings should be from 1 to 5 only");
		}
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
	
	public boolean isTeacherPresent(String employeeIdEntered) {
		if (employeeIdEntered.equals(employeeID)) {
			return true;
		}
		return false;
	}

}
