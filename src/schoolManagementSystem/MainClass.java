package schoolManagementSystem;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {

		SchoolClass schoolClass = new SchoolClass();

		Scanner sc = new Scanner(System.in);

		// Add Students
		schoolClass.addStudents(new Student("Gurleen", 26, "Female", "S1001", 80));
		schoolClass.addStudents(new Student("Kirat", 26, "Male", "S1004", 86));

		// Add Teachers
		schoolClass.addTeachers(new Teacher("Alice Johnson", 40, "Male", "T1001", 1000));
		schoolClass.addTeachers(new Teacher("Cherry Brown", 32, "Female", "T1002", 800));

		System.out.println("Welcome to " + SchoolClass.name + " Stream Allocation and Teacher Rating System!");

		System.out.println("Please enter the student's ID: ");
		String studentId = sc.next();

		if (schoolClass.isStudentPresent(studentId)) {

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

			schoolClass.student.determineStream(academicPercentage);

			System.out.println("Would you like to rate a Teacher: 1.Yes || 2.No");
			int option = sc.nextInt();
			switch (option) {
			case 1:
				System.out.println("Please enter the teacher's name you wish to rate: ");
				String teachersName = sc.next();
				System.out.println("Please enter the teacher's Id you wish to rate: ");
				String teachersId = sc.next();

				if (schoolClass.teacher.isTeacherPresent(teachersId)) {
					System.out.println("Please enter your rating for " + teachersName);
					int ratingEntered = sc.nextInt();
					schoolClass.teacher.addRating(ratingEntered);

					System.out.println("-- Updated Teacher Rating --");
					System.out.println("Teacher: " + teachersName);

					System.out.println("New Average Rating: " + schoolClass.teacher.calculateAverageRating());
				} else {
					System.out.println("Teacher doesn't exist");
				}

				break;
			default:
				break;
			}

		} else {
			System.out.println("Student doesn't exist");
		}
	}
}
