package schoolManagementSystem;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		SchoolClass schoolClass = new SchoolClass();
		schoolClass.addStudents("Gurleen");
		schoolClass.addTeachers("Ketaki");
		Student student = new Student("Gurleen", 26, "Female", "12345", 80);
		Teacher teacher = new Teacher("Ketaki", 28, "Female", "2001", 3000);

		System.out.println("Welcome to " + SchoolClass.name + " Stream Allocation and Teacher Rating System!");

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the student's name: ");
		String name = sc.next();

		System.out.println("Please enter the student's age: ");
		int age = sc.nextInt();

		System.out.println("Please enter the student's gender: ");
		String gender = sc.next();

		System.out.println("Please enter the student's academic percentage: ");
		double academicPercentage = sc.nextDouble();

			System.out.println("-- Stream Allocation Result --");
			System.out.println("Name: " + name + ", Age: " + age + ", Gender: " + gender + ", Academic Percentage: "
					+ academicPercentage + "%");
			student.determineStream(academicPercentage);

			System.out.println("Please enter the teacher's name you wish to rate: ");
			String teachersName = sc.next();

			System.out.println("Please enter your rating for " + teachersName);
			int ratingEntered = sc.nextInt();
			teacher.addRating(ratingEntered);

				System.out.println("-- Updated Teacher Rating --");
				System.out.println("Teacher: " + teachersName);
				System.out.println("New Average Rating: " + teacher.calculateAverageRating());
	}

}
